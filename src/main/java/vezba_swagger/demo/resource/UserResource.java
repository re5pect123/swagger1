package vezba_swagger.demo.resource;



import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers(){
        return Arrays.asList(new User("Sam", 2000L), new User("Peter", 100L));
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName, 1000L);
    }

    private class User{
        @ApiModelProperty(notes = "name of user")
        private String userName;
        @ApiModelProperty(notes = "salary of the user")
        private Long salary;


        public User(String userName, Long salary) {
            this.userName = userName;
            this.salary = salary;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }

}
