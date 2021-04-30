package com.roofstacks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoofStacksPage extends BasePage{

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    public WebElement googleSearchInput;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]")
    public WebElement googleSearchBtn;

    @FindBy(xpath = "//*[@id='rso']/div[2]/div[2]/div/div/div[1]/a/h3")
    public WebElement roofStackSelectionBtn;

    @FindBy(xpath = "/html/body/main/nav/div/div[2]/ul/li[4]/a")
    public WebElement careerSelectionBtn;

    @FindBy(xpath = "//*[@id='slide-portfolio']/div/ul/li[2]/div/a/h4")
    public WebElement productSelectionBtn;

    @FindBy(xpath = "//*[@id='slide-portfolio']/div/ul/li[3]/figure/a/span")
    public WebElement leadProductTesterSelectionBtn;

    @FindBy(xpath = "/html/body/main/div[2]/div/div")
    public WebElement leadProductTesterText;

    @FindBy(xpath = "/html/body/main/div[3]/div/div[2]/div/div[1]/div/a/h3/small")
    public WebElement sendCVSelectionBtn;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@id='file']")
    public WebElement selectFileButton;





















}
