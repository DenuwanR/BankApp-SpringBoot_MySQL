// ©Denuwan-2024
package denuwan.BankApp.repository;


import denuwan.BankApp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
