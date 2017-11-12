package vezba_swagger.demo.resource;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld Resource", description = "show me hello world")
public class HelloResource {

    @ApiOperation(value = "Returns hello world")
    @ApiResponses(
            value={
                    @ApiResponse(code = 100, message = "is ok"),
                    @ApiResponse(code = 200, message = "is success"),
                    @ApiResponse(code = 300, message = "is redirect")
            }
    )
    @GetMapping
    public String helloGet(){
        return "hello world";
    }

    @ApiOperation(value = "Return start")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }
}
