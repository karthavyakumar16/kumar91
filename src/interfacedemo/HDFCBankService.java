package interfacedemo;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNumber, String toAccountNumber, int amt) {
        return "HDFC Transfer";
    }
}
