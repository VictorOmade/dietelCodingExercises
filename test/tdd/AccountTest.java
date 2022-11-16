package tdd;

import org.junit.jupiter.api.Test;

  public class AccountTest {
}

     @Test
   public void depositTest() {
      //given
         Account deborahAccount = new Account();

         // when i deposit 5000
         deborahAccount.deposit(5000);

         //check that balance is 5000
         int deborahAccountBalance= deborahAccount.getBalance();

         assertEquals(5000, deborahAccountBalance);
     }
     @Test
  public void depositTwiceTest(){
     //given there is an account
     //given that initial balance is 4000
         deborahAccount.deposit(amount:4000);
     //when i deposit 2000
         Account deborahAccount=newAccount();
         deborahAccount.deposit(amount:2000);
     //check that balance is 6000




     @Test
     void 
