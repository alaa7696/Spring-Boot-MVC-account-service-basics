package starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountRepository accountRepository;

    private List<Account> ll =new ArrayList<>(Arrays.asList
            (new Account("acc1",2300,1200,110), new Account("acc2",7000,1211,2211), new Account("acc3",21000,12111,1100)));

    public List<Account> getLl(){

        return ll;
    }

    public Account getSolde(String id){
        return ll.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addAccount(Account account) {

        ll.add(account);
    }

    public void updateTopic(Account account, String id) {

    for(int i = 0; i< ll.size(); i++){
        if (ll.get(i).getId().equals(id))
        {
           ll.set(i,account);
            return;
        }
    }
    }

    public void deleteAccount(String id) {
        ll.removeIf(t->t.getId().equals(id));
    }
}
