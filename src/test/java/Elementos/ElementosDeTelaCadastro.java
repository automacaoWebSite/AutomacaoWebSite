package Elementos;

import org.openqa.selenium.By;

public class ElementosDeTelaCadastro {
	
	private By imageUpload = By.cssSelector("input[type='file']");
	
	private By firstName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input");
	private By lastName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input");
	private By address = By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea");
	private By emailAddress = By.cssSelector("#eid > input");
	private By phone = By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input");
	private By gener = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	private By hobbies = By.xpath("//*[@id=\"checkbox2\"]");
	
	 private By languages = By.xpath("//*[@id='msdd']");
	 private By languagess = By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[29]/a");
    
	private By skills = By.xpath("//*[@id=\"Skills\"]/option[5]");
	//private By country = By.xpath("//*[@id=\"countries\"]");
	private By selectCountry = By.cssSelector("#country > option:nth-child(2)");
	private By dateOfBirtha = By.xpath("//*[@id=\"yearbox\"]/option[83]");
	private By dateOfBirthm = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[3]");
	private By dateOfBirthd = By.xpath("//*[@id=\"daybox\"]/option[26]");
	private By password = By.cssSelector("#firstpassword");
	private By confirmPassword = By.cssSelector("#secondpassword");
	private By btnSubmit = By.xpath("//*[@id=\"submitbtn\"]");
	
	
	
    public By getImageUpload() {
        return imageUpload;
        
    }
	
	public By getfirstName() {
		return firstName;
	}
	
	public By getlastName() {
		return lastName;
	}

	public By getAddress() {
		return address;
	}

	public By getEmailAddress() {
		return emailAddress;
	}

	public By getPhone() {
		return phone;
	}

	public By getGener() {
		return gener;
	}

	public By getHobbies() {
		return hobbies;
	}
	
	public By getLanguages() {
	    return languages;
	}
	
	public By getLanguagess() {
		return languagess;
		
	}

	public By getSkills() {
		return skills;
	}

	//public By getCountry() {
		//return country;
		
	//}
	

	public By getSelectCountry() {
		return selectCountry;
	}

	public By getDateOfBirtha() {
		return dateOfBirtha;
	}

	public By getDateOfBirthm() {
		return dateOfBirthm;
	}

	public By getDateOfBirthd() {
		return dateOfBirthd;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getBtnSubmit() {
		return btnSubmit;
	}


}
