package builderPatternProject;

public class bank4 {
	
	
	BankAccount account = new BankAccount.Builder(1234L)
            .withOwner("Marge")
            .atBranch("Springfield")
            .openingBalance(100)
            .atRate(2.5)
            .build();

BankAccount anotherAccount = new BankAccount.Builder(4567L)
            .withOwner("Homer")
            .atBranch("Springfield")
            .openingBalance(100)
            .atRate(2.5)
            .build();

}

//BankAccount account = new BankAccount(456L, "Marge", "Springfield", 100.00, 2.5);
//BankAccount anotherAccount = new BankAccount(789L, "Homer", null, 2.5, 100.00);

