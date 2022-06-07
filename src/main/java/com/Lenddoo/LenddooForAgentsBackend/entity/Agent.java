package com.Lenddoo.LenddooForAgentsBackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import java.security.NoSuchAlgorithmException;  
//import java.security.SecureRandom;  
//import java.security.spec.InvalidKeySpecException;  
//import java.util.Arrays;  
//import java.util.Base64;  
//import java.util.Random; 
//import javax.crypto.SecretKeyFactory;  
//import javax.crypto.spec.PBEKeySpec; 
import javax.persistence.SequenceGenerator;

@Entity
public class Agent {

	@Id
	@SequenceGenerator(name = "agent_sequence", sequenceName = "agent_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agent_sequence")
	private Long IdAgent;
	
	private String FirstName;
	
	private String LastName;
	
	private String Email;
	
	private String Password;

	private String PhoneNumber;
	
	private String AgencyName;
	
	public Agent() {
		super();
	}

	public Agent(String firstName, String lastName, String email, String password, String phoneNumber,
			String agencyName) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		PhoneNumber = phoneNumber;
		AgencyName = agencyName;
	}



	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAgencyName() {
		return AgencyName;
	}

	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	
//	private void enc() {  
//        
//        /* generates the Salt value. It can be stored in a database. */  
//        String saltvalue = PassBasedEnc.getSaltvalue(30);  
//          
//        /* generates an encrypted password. It can be stored in a database.*/  
//        String encryptedpassword = PassBasedEnc.generateSecurePassword(this.Password, saltvalue);
//          
//        Boolean status = PassBasedEnc.verifyUserPassword(this.Password,encryptedpassword,saltvalue);  
//        if(status==true)  
//            System.out.println("Password Matched!!");  
//        else  
//            System.out.println("Password Mismatched");
//	}
	
}

//class PassBasedEnc   
//{  
//    /* Declaration of variables */   
//    private static final Random random = new SecureRandom();  
//    private static final String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";  
//    private static final int iterations = 10000;  
//    private static final int keylength = 256;  
//      
//    /* Method to generate the salt value. */  
//    public static String getSaltvalue(int length)   
//    {  
//        StringBuilder finalval = new StringBuilder(length);  
//  
//        for (int i = 0; i < length; i++)   
//        {  
//            finalval.append(characters.charAt(random.nextInt(characters.length())));  
//        }  
//  
//        return new String(finalval);  
//    }     
//  
//    /* Method to generate the hash value */  
//    public static byte[] hash(char[] password, byte[] salt)   
//    {  
//        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keylength);  
//        Arrays.fill(password, Character.MIN_VALUE);  
//        try   
//        {  
//            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");  
//            return skf.generateSecret(spec).getEncoded();  
//        }   
//        catch (NoSuchAlgorithmException | InvalidKeySpecException e)   
//        {  
//            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);  
//        }   
//        finally   
//        {  
//            spec.clearPassword();  
//        }  
//    }  
//  
//    /* Method to encrypt the password using the original password and salt value. */  
//    public static String generateSecurePassword(String password, String salt)   
//    {  
//        String finalval = null;  
//  
//        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());  
//   
//        finalval = Base64.getEncoder().encodeToString(securePassword);  
//   
//        return finalval;  
//    }  
//      
//    /* Method to verify if both password matches or not */  
//    public static boolean verifyUserPassword(String providedPassword,  
//            String securedPassword, String salt)  
//    {  
//        boolean finalval = false;  
//          
//        /* Generate New secure password with the same salt */  
//        String newSecurePassword = generateSecurePassword(providedPassword, salt);  
//          
//        /* Check if two passwords are equal */  
//        finalval = newSecurePassword.equalsIgnoreCase(securedPassword);  
//          
//        return finalval;  
//    }  
//} 
