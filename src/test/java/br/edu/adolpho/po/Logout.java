/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.adolpho.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 *
 * @author Criação
 */
public class Logout extends MediaWikiPage{
    
   // @FindBy(xpath = "//*[@id=\"pt-logout\"]/a")
   // WebElement logout;
    
    public Logout(WebDriver driver) {
        super(driver);
    }
    
    //public Logout setLogout() {
       // logout.click();
      //  return new Logout(driver);
    //}
    
}
