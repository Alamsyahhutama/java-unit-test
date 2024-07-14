package kang.alamsyah.hutama.test.service;


import kang.alamsyah.hutama.test.data.Person;
import kang.alamsyah.hutama.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);

    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // menambah behavior ke mock object

        Mockito.when(personRepository.selectById("alam"))
                .thenReturn(new Person("alam", "Alam"));
       var person = personService.get("alam");

       Assertions.assertNotNull(person);
       Assertions.assertEquals("alam", person.getId());
       Assertions.assertEquals("Alam", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Alam");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Alam", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Alam"));
    }
}
