package starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @RequestMapping(value = "/accounts",method =RequestMethod.GET)
    public List<Account> getSolde(){
        return accountsService.getLl();
    }

    @RequestMapping(value = "/accounts/{id}",method = RequestMethod.GET)
    public Account getSolde(@PathVariable String id){
        return accountsService.getSolde(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/accounts")
    public void addTopic(@RequestBody Account account){
        accountsService.addAccount(account);

    }
    @RequestMapping(method = RequestMethod.PUT,value = "accounts/{id}")
    public void updateAccount(@RequestBody Account account, @PathVariable  String id){
        accountsService.updateTopic(account,id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "accounts/{id}")
    public void deleteAccount(@PathVariable String id){
        accountsService.deleteAccount(id);
    }

}
