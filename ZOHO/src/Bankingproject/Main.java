package Bankingproject;
import java.util.*;
import java.io.*;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	static int id = 5;
	static int accountNumber = 1004;
	static ArrayList<Integer>cusId = new ArrayList<Integer>();
	static ArrayList<Integer> accountNo= new ArrayList<Integer>();
	static ArrayList<String> name = new ArrayList<String>();
	static ArrayList<Integer> balance = new ArrayList<Integer>();
	static ArrayList<String> encryptedPwd = new ArrayList<String>();

	// Initial Accounts in bank
	public static void initial() {
		cusId.add(1);cusId.add(2);cusId.add(3);cusId.add(4);
		accountNo.add(1000);accountNo.add(1001);accountNo.add(1002);accountNo.add(1003);
		name.add("Kumar");name.add("Madhu");name.add("Rahul");name.add("Robin");
		balance.add(10000);balance.add(20000);balance.add(30000);balance.add(40000);
		encryptedPwd.add("ApipNbjm");encryptedPwd.add("Cboljoh");encryptedPwd.add("dbnqvt");
		encryptedPwd.add("kbwb22");
	}
	
	// Password Encryption
	public String passwordEncryption(String password) {
		char ch[] = password.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isAlphabetic(ch[i])) {
				if(ch[i]=='z') {
					ch[i]='a';
				}
				else if(ch[i]=='Z') {
					ch[i]='A';
				}
				else {
					ch[i]=++ch[i];
				}
			}
			else if(Character.isDigit(ch[i])) {
				int temp =(int) ch[i];
				ch[i] = (char) ++temp;
			}
		}
		password = "";
		password = String.valueOf(ch);
		return password;
	}
	
	// Password Decryption
	public String passwordDecryption(String password) {
		char ch[] = password.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isAlphabetic(ch[i])) {
				if(ch[i]=='a') {
					ch[i]='z';
				}
				else if(ch[i]=='A') {
					ch[i]='Z';
				}
				else {
					ch[i]=--ch[i];
				}
			}
			else if(Character.isDigit(ch[i])) {
				int temp =(int) ch[i];
				ch[i] = (char) --temp;
			}
		}
		password = "";
		password = String.valueOf(ch);
		return password;
	}
	
	// Login Validation
	public int loginValidation(String userName,String password) {
		int us=0,pas=0;
		for (String string : name) {
			us+=1;
			if(userName.equals(string)) {
				for(String pass: encryptedPwd) {
					pas+=1;
					if(pas==us) {
						pass=passwordDecryption(pass);
						if(pass.equals(password)) {
							return pas;
						}
					}
				}
			}
		}
		return 0;
	}

	// Password Validation
	public boolean passwordValidation(String pass) {
		char ch[] = pass.toCharArray();
		int valid = 0;
		if(pass.length()>=8) {
			for (int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i])) {
					valid+=1;
				}
			}
			if(valid>=2) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
	// Atm Withdrawal
	public void atmWithdrawal(int value) { 
			System.out.println("Enter the Debit amount");
			int debit = in.nextInt();
			int n =0;
			try {
				for (Integer bal : balance) {
					n+=1;
					if(n==value) {
						bal=bal-debit;
						if(bal>1000) {
							if(n==value){
								balance.set(n-1,bal);
							}
						}
						else {
							System.out.println("Amount is not enough to Debit...");
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Error...");
			}
			updatedRecord(value);
	}
	
	// Cash Deposit
	public void cashDeposit(int value) {
		System.out.println("Enter the credit amount");
		int credit = in.nextInt();
		int n =0;
		for (Integer bal : balance) {
			n+=1;
			if(n==value){
				System.out.println("Previous account balance: "+bal);
				credit+= bal;
				balance.set(n-1,credit);
			}
		}
		updatedRecord(value);
	}

	// Account Transfer
	public void accountTransfer(int value) {
		System.out.println("Enter the Transfer Account Number: ");
		int number = in.nextInt();
		System.out.println("Enter the Transfer Amount: ");
		int amount = in.nextInt();
		int n=0,bn=0,tn=0,bal=0,flag=0;
		try {
			for (Integer no : accountNo) {
				n+=1;
				if(number == no) {
					flag=1;
					for (Integer tbal: balance) {
						tn+=1;
						if(tn==n) {
							bal = tbal;
						}
					}
				}
				else {
					flag=0;
				}
				if(flag==1) {
					break;
				}
			}
			if(n==accountNo.size()) {
				System.out.println("Account not found...");
			}
			else {
				for (Integer balf: balance) {
					bn+=1;
					if(bn==value) {
						int check = balf-amount;
						if(check>1000) {
							balf=balf-amount;
							balance.set(bn-1,balf);
							System.out.println("Your Account Balance: "+balf);
							updatedRecord(bn);
							System.out.println("Transfered Account Balance: "+(amount+bal));
							balance.set(n-1,(amount+bal));
							updatedRecord(n);
						}
						else {
							System.out.println("Amount is not enough to Transfer...");
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error...");
		}
	}
	
	//Updated Records
	public void updatedRecord(int value) {
		int n=0;
		for (Integer bal : balance) {
			n+=1;
			if(n==value) {
				System.out.println("Your Balance: "+bal);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main obj = new Main();
		initial();
		while(true) {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Enter your choice : ");
			System.out.println(" 1 -> Dispaly Records ");
			System.out.println(" 2 -> Add new Records ");
			System.out.println(" 3 -> Login Account");
			int choice = in.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Account Holders Name: ");
				for (String string : name) {
					System.out.println(string);
				}
				System.out.println("Account Holder Balance: ");
				for (Integer i: balance) {
					System.out.println(i);
				}
				break;
				
			case 2:
				in.nextLine();
				System.out.println("Enter the your name: ");
				String tempName = in.nextLine();
				System.out.println("Password length 8, 2 numbers include");
				System.out.println("Enter your password: ");
				String tempPass = in.nextLine();
				System.out.println("Retype your password: ");
				String tempRePass = in.nextLine();
				int initialBalance = 10000;
				if(tempPass.equals(tempRePass)) {
					if(obj.passwordValidation(tempPass)) {
						tempRePass = "";
						tempRePass = obj.passwordEncryption(tempPass);
						cusId.add(id); id++;
						accountNo.add(accountNumber); accountNumber++;
						name.add(tempName);
						balance.add(initialBalance);
						encryptedPwd.add(tempRePass);
						System.out.println("Successfully Added your Account ");
						System.out.println("AccountNo->"+(accountNumber-1)+"  Name->"+tempName+"  Password->"+tempPass);
					}
					else {
						System.out.println("Password did follow the condition...");
					}
				}
				else {
					System.out.println("Password did not match...");
				}
				tempName="";tempPass="";tempRePass="";
				break;
				
			case 3: 
				in.nextLine();
				System.out.println("Enter your username: ");
				String userName = in.nextLine();
				System.out.println("Enter your password: ");
				String password = in.nextLine();
				if(obj.loginValidation(userName,password)!=0) {
					int value = obj.loginValidation(userName,password);
					System.out.println("Our banking application will support the following operations");
					System.out.println("1-> ATM Withdrawal");
					System.out.println("2-> Cash Deposit");
					System.out.println("3-> Account Transfer");
					System.out.println("Enter your choice: ");
					int choice1 = in.nextInt();
					switch(choice1) {
					case 1:
						obj.atmWithdrawal(value);
						break;
						
					case 2:
						obj.cashDeposit(value);
						break;
						
					case 3:
						obj.accountTransfer(value);
						break;
					
					default:
						break;
					}
				}
				else {
					System.out.println("Invalid username and password...");
				}
				break;
				
			default: 
				break;
		}
		}
	}

}
