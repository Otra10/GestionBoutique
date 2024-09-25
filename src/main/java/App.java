import com.example.data.repositories.ClientRepository;
import com.example.data.repositories.DebtRepository;
import com.example.services.ClientService;
import com.example.services.DebtService;
import com.example.views.BoutiquierView;

public class App {
    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        DebtRepository debtRepository = new DebtRepository();

        ClientService clientService = new ClientService(clientRepository);
        DebtService debtService = new DebtService(debtRepository);

        BoutiquierView view = new BoutiquierView(clientService, debtService);
        view.displayMenu();
    }
}
