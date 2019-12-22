import models.users.Datum;
import models.users.RegisterUserInfo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.GetUsersQuestion;
import questions.ResponseCode;
import tasks.GetUsers;
import tasks.RegisterUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(SerenityRunner.class)
public class SerenityInitialTests {

    private static final String restApiUrl= "https://reqres.in/api";

    @Test
    public void initialTest(){
        Actor Johan = Actor.named("Johan")
                .whoCan(CallAnApi.at(restApiUrl));

        Johan.attemptsTo(
                GetUsers.fromPage(1)
        );

        Johan.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(200))
        );

            Datum user = new GetUsersQuestion().answeredBy(Johan)
                    .getData().stream().filter(x->x.getId()==1).findFirst().orElse( null);
        //primero se valida que el objeto no sea nulo
            Johan.should(
                    seeThat("Usuario no es nulo", act -> user, notNullValue())
            );
        //luego se realiza la asercion, se pueden añadir varias aserciones con ,
            Johan.should(
                    seeThat("El email del usuario", act -> user.getEmail(), equalTo("george.bluth@reqres.in")),
                    seeThat("El avatar del usuario", act -> user.getAvatar(),equalTo("avatar"))
            );
    }

    @Test
    public void registerUserTest(){
        Actor Johan = Actor.named("Johan")
                .whoCan(CallAnApi.at(restApiUrl));

        RegisterUserInfo  registerUserInfo = new RegisterUserInfo();
        registerUserInfo.setName("morpheus");
        registerUserInfo.setJob("leader");
        registerUserInfo.setEmail("charles.morris@reqres.in");
        registerUserInfo.setPassword("serenity");

        Johan.attemptsTo(
                RegisterUser.withInfo(registerUserInfo)

        );

        Johan.should(
                seeThat("el codigo de respuesta", new ResponseCode(),equalTo(200))
        );
    }

}
