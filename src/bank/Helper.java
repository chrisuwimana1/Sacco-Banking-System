/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.HashMap;
import java.util.regex.Pattern;

/**
 *
 * @author chris
 */
public class Helper {

    public Helper() {

    }

    public HashMap<String, String> getVillageCodes() {

        HashMap<String, String> villages = new HashMap<>();
        villages.put("Amajyambere", "OL01001097");
        villages.put("Bukinanyana", "OL01001099");
        villages.put("Cyimana", "OL01001101");
        villages.put("Gataba", "OL01001103");
        villages.put("Itetero", "OL01001105");
        villages.put("Kabare", "OL01001107");
        villages.put("Kamuhire", "OL01001109");
        villages.put("Karukamba", "OL01001111");
        villages.put("Nyagacyamo", "OL01001113");
        villages.put("Rwinzovu", "OL01001115");
        villages.put("Urugwiro", "OL01001117");
        villages.put("Uruhongore", "OL01001119");
        villages.put("Agasaro", "OL01001121");
        villages.put("Gasharu", "OL01001123");
        villages.put("Inkingi", "OL01001125");
        villages.put("Kanserege", "OL01001127");
        villages.put("Kigugu", "OL01001129");
        villages.put("Ruganwa", "OL01001131");
        villages.put("Umuco", "OL01001133");
        villages.put("Umutekano", "OL01001135");
        villages.put("Urugero", "OL01001137");
        villages.put("Urwibutso", "OL01001139");
        villages.put("Amahoro", "OL01001141");
        villages.put("Bwiza", "OL01001143");
        villages.put("Ihuriro", "OL01001145");
        villages.put("Ineza", "OL01001147");
        villages.put("Inyange", "OL01001149");
        villages.put("Iriba", "OL01001151");
        villages.put("Kabagari", "OL01001153");
        villages.put("Ubumwe", "OL01001155");
        villages.put("Umutako", "OL01001157");
        villages.put("Urukundo", "OL01001159");
        villages.put("Virunga", "OL01001161");

        return villages;
    }

    public HashMap<String, String> getEconomicSubSectorISICCodes() {

        HashMap<String, String> economicsubsectorISICCodes = new HashMap<>();

        economicsubsectorISICCodes.put("Growing of rice", "0112");
        economicsubsectorISICCodes.put("Growing of vegetables and melons, roots and tubers", "0113");
        economicsubsectorISICCodes.put("Raising of cattle and buffaloes", "0141");
        economicsubsectorISICCodes.put("Raising of sheep and goats", "0144");
        economicsubsectorISICCodes.put("Raising of swine/pigs", "0145");
        economicsubsectorISICCodes.put("Raising of poultry", "0146");
        economicsubsectorISICCodes.put("Mixed farming", "0150");
        economicsubsectorISICCodes.put("Manufacture of dairy products", "1050");
        economicsubsectorISICCodes.put("Manufacture of other food products n.e.c.", "1079");
        economicsubsectorISICCodes.put("Weaving of textiles", "1312");
        economicsubsectorISICCodes.put("Repair of machinery", "3312");
        economicsubsectorISICCodes.put("Electrical installation", "4321");
        economicsubsectorISICCodes.put("Wholesale of food, beverages and tobacco", "4630");
        economicsubsectorISICCodes.put("Wholesale of textiles, clothing and footwear", "4631");
        economicsubsectorISICCodes.put("Wholesale of other household goods", "4649");
        economicsubsectorISICCodes.put("Wholesale of other machinery and equipment", "4659");
        economicsubsectorISICCodes.put("Restaurants and mobile food service activities", "5610");
        economicsubsectorISICCodes.put("Beverage serving activities", "5630");
        economicsubsectorISICCodes.put("Accounting, bookkeeping and auditing activities; tax consultancy", "6920");
        economicsubsectorISICCodes.put("Higher education", "8530");
        economicsubsectorISICCodes.put("Sports and recreation education", "8541");
        economicsubsectorISICCodes.put("Cultural education", "8542");
        economicsubsectorISICCodes.put("Other education n.e.c.", "8549");
        economicsubsectorISICCodes.put("Hospital activities", "8610");
        economicsubsectorISICCodes.put("Activities of religious organizations", "9491");
        economicsubsectorISICCodes.put("Other personal service activities n.e.c.", "9609");

        return economicsubsectorISICCodes;
    }

    public HashMap<String, Integer> getNaicsCodes() {

        HashMap<String, Integer> naicsCodes = new HashMap<>();
        naicsCodes.put("Default NAICS Code", 999999);

        return naicsCodes;
    }

    public HashMap<String, Integer> getOccupationCodes() {

        HashMap<String, Integer> occupationCodes = new HashMap<>();
        occupationCodes.put("Not Applicable", 9999);
        occupationCodes.put("Others in General", 99);
        occupationCodes.put("Unemployed", 9998);
        occupationCodes.put("Commissioned armed forces officers", 1010);
        occupationCodes.put("Non-commissioned armed forces officers", 1010);
        occupationCodes.put("Armed forces occupations, other ranks", 3010);
        occupationCodes.put("Managing directors and chief executives", 1120);
        occupationCodes.put("Finance managers", 1211);
        occupationCodes.put("Agricultural and forestry production managers", 1311);
        occupationCodes.put("Financial and insurance services branch managers", 1346);
        occupationCodes.put("Hotel managers", 1411);
        occupationCodes.put("Restaurant managers", 1412);
        occupationCodes.put("Civil engineers", 2142);
        occupationCodes.put("Environmental engineers", 2143);
        occupationCodes.put("Mechanical engineers", 2144);
        occupationCodes.put("Electronics engineers", 2152);
        occupationCodes.put("Generalist medical practitioners", 2211);
        occupationCodes.put("Specialist medical practitioners", 2212);
        occupationCodes.put("Nursing professionals", 2221);
        occupationCodes.put("Traditional and complementary medicine professionals", 2230);
        occupationCodes.put("Veterinarians", 2250);
        occupationCodes.put("Pharmacists", 2262);
        occupationCodes.put("University and higher education teachers", 2310);
        occupationCodes.put("Secondary education teachers", 2330);
        occupationCodes.put("Primary school teachers", 2341);
        occupationCodes.put("Accountants", 2411);
        occupationCodes.put("Lawyers", 2611);
        occupationCodes.put("Judges", 2612);
        occupationCodes.put("Religious professionals", 2636);
        occupationCodes.put("Journalists", 2642);
        occupationCodes.put("Musicians, singers and composers", 2652);
        occupationCodes.put("Religious associate professionals", 3413);
        occupationCodes.put("Athletes and sports players", 3421);
        occupationCodes.put("Sports coaches, instructors and officials", 3422);
        occupationCodes.put("Photographers", 3431);
        occupationCodes.put("Secretaries", 4120);
        occupationCodes.put("Bank tellers and related clerks", 4211);
        occupationCodes.put("Receptionists", 4226);
        occupationCodes.put("Cooks", 5120);
        occupationCodes.put("Waiters", 5131);
        occupationCodes.put("Bartenders", 5132);
        occupationCodes.put("Hairdressers", 5141);
        occupationCodes.put("Shop keepers", 5221);
        occupationCodes.put("Cashiers and ticket clerks", 5230);
        occupationCodes.put("Police officers", 5412);
        occupationCodes.put("Prison guards", 5413);
        occupationCodes.put("Security guards", 5414);
        occupationCodes.put("Field crop and vegetable growers", 6111);
        occupationCodes.put("Livestock and dairy producers", 6121);
        occupationCodes.put("Poultry producers", 6122);
        occupationCodes.put("House builders", 7111);
        occupationCodes.put("Potters and related workers", 7314);
        occupationCodes.put("Handicraft workers in wood, basketry and related materials", 7317);
        occupationCodes.put("Handicraft workers in textile, leather and related materials", 7318);
        occupationCodes.put("Building and related electricians", 7411);
        occupationCodes.put("Tailors, dressmakers, furriers and hatters", 7531);
        occupationCodes.put("Shoemakers and related workers", 7536);
        occupationCodes.put("Motorcycle drivers", 8321);
        occupationCodes.put("Car, taxi and van drivers", 8322);
        occupationCodes.put("Bus and tram drivers", 8331);
        occupationCodes.put("Heavy truck and lorry drivers", 8332);
        occupationCodes.put("Domestic cleaners and helpers", 9111);
        occupationCodes.put("Cleaners and helpers in offices, hotels and other establishments", 9112);
        occupationCodes.put("Crop farm labourers", 9211);
        occupationCodes.put("Livestock farm labourers", 9212);
        occupationCodes.put("Garbage and recycling collectors", 9611);

        return occupationCodes;
    }

    public HashMap<String, Integer> getIncomeRangeCodes() {

        HashMap<String, Integer> incomeRanges = new HashMap<>();

        incomeRanges.put("0 -30,000", 1);
        incomeRanges.put("30,001 - 100,000", 2);
        incomeRanges.put("101,000 - 170,000", 3);
        incomeRanges.put("171,000 - 230,000", 4);
        incomeRanges.put("231,000 - 300,000", 5);
        incomeRanges.put("301,000 - 370,000", 6);
        incomeRanges.put("371,000 - 440,000", 7);
        incomeRanges.put("441,000 - 510,000", 8);
        incomeRanges.put("511,000 - 580,000", 9);
        incomeRanges.put("581,000 - 650,000", 10);
        incomeRanges.put("651,000 - 720,000", 11);
        incomeRanges.put("721,000 - 790,000", 12);
        incomeRanges.put("791,000 - 860,000", 13);
        incomeRanges.put("861,000 - 930,000", 14);
        incomeRanges.put("931,000 - 1,000,000", 15);
        incomeRanges.put("1,001,000 - 1,070,000", 16);
        incomeRanges.put("1,071,000 - 1,140,000", 17);
        incomeRanges.put("1,141,000 - 1,210,000", 18);
        incomeRanges.put("1,211,000 - 1,280,000", 19);
        incomeRanges.put("1,281,000 - 1,350,000", 20);
        incomeRanges.put("1,351,000 - 1,420,000", 21);
        incomeRanges.put("1,421,000 - 1,490,000", 22);
        incomeRanges.put("1,491,000 - 1,560,000", 23);
        incomeRanges.put("1,561,000 - 1,630,000", 24);
        incomeRanges.put("1,631,000 - 1,700,000", 25);
        incomeRanges.put("1,701,000 - 1,770,000", 26);
        incomeRanges.put("1,771,000 - 1,840,000", 27);
        incomeRanges.put("1,841,000 - 1,910,000", 28);
        incomeRanges.put("1,911,000 - 1,980,000", 29);
        incomeRanges.put("1,981,000  and  above", 30);

        return incomeRanges;
    }

    public HashMap<String, Integer> getCustomerStatusCodes() {

        HashMap<String, Integer> customerStatusCodes = new HashMap<>();

        customerStatusCodes.put("Active", 0);
        customerStatusCodes.put("Inactive", 1);
        customerStatusCodes.put("Delete", 9);

        return customerStatusCodes;
    }

    public HashMap<String, Integer> getLegalStatusCodes() {

        HashMap<String, Integer> legalStatusCodes = new HashMap<>();

        legalStatusCodes.put("Sole Trader", 1);
        legalStatusCodes.put("Partnership", 2);
        legalStatusCodes.put("Private Company", 3);
        legalStatusCodes.put("Public Company", 4);
        legalStatusCodes.put("Trustee", 5);
        legalStatusCodes.put("Co operatives", 6);
        legalStatusCodes.put("Non-Profit Organization", 7);

        return legalStatusCodes;
    }

    public HashMap<String, String> getIncomeFrequencyCodes() {

        HashMap<String, String> incomeFrequencyCodes = new HashMap<>();

        incomeFrequencyCodes.put("Monthly", "M");
        incomeFrequencyCodes.put("Quarterly", "Q");
        incomeFrequencyCodes.put("Annual", "A");
        incomeFrequencyCodes.put("Daily", "D");
        incomeFrequencyCodes.put("Weekly", "W");
        incomeFrequencyCodes.put("Not Applicable", "NA");

        return incomeFrequencyCodes;
    }

    public HashMap<String, Integer> getRelationshipTypeCodes() {

        HashMap<String, Integer> relationshipTypeCodes = new HashMap<>();

        relationshipTypeCodes.put("Direct or indirect relationship with the bank", 24);
        relationshipTypeCodes.put("Non Related Party", 25);
        relationshipTypeCodes.put("Spouse", 1);
        relationshipTypeCodes.put("Husband", 2);
        relationshipTypeCodes.put("Wife", 3);
        relationshipTypeCodes.put("Father", 4);
        relationshipTypeCodes.put("Mother", 5);
        relationshipTypeCodes.put("Son", 6);
        relationshipTypeCodes.put("Daughter", 7);
        relationshipTypeCodes.put("Brother", 8);
        relationshipTypeCodes.put("Sister", 9);
        relationshipTypeCodes.put("Monthly", 10);
        relationshipTypeCodes.put("Grandfather", 11);
        relationshipTypeCodes.put("Grandmother", 12);
        relationshipTypeCodes.put("Granddaughter", 13);
        relationshipTypeCodes.put("Uncle", 14);
        relationshipTypeCodes.put("Aunt", 15);
        relationshipTypeCodes.put("Cousin", 16);
        relationshipTypeCodes.put("Nephew", 17);
        relationshipTypeCodes.put("Niece", 18);
        relationshipTypeCodes.put("Father-in-law", 19);
        relationshipTypeCodes.put("Mother-in-law", 20);
        relationshipTypeCodes.put("Brother-in-law", 21);
        relationshipTypeCodes.put("Sister-in-law", 22);
        relationshipTypeCodes.put("Self", 23);

        return relationshipTypeCodes;
    }

    public HashMap<String, Integer> getEducationCodes() {

        HashMap<String, Integer> educationCodes = new HashMap<>();

        educationCodes.put("PHD", 1);
        educationCodes.put("Masters", 2);
        educationCodes.put("Bachelors Degree", 3);
        educationCodes.put("Diploma (A2 or A1 level)", 4);
        educationCodes.put("School attendace below A2 level", 5);
        educationCodes.put("High School", 6);
        educationCodes.put("Primary School", 7);
        educationCodes.put("Below Primary", 8);

        return educationCodes;
    }

    public HashMap<String, String> getResidenceTypeCodes() {

        HashMap<String, String> residenceTypeCodes = new HashMap<>();
        residenceTypeCodes.put("Owner", "O");
        residenceTypeCodes.put("Tenant", "T");

        return residenceTypeCodes;
    }

    public HashMap<String, Integer> getNationalIdTypeCodes() {

        HashMap<String, Integer> nationalIdTypeCodes = new HashMap<>();
        nationalIdTypeCodes.put("Driving_License", 1);
        nationalIdTypeCodes.put("National_ID(Mandatory for Rwandan Nationals)", 2);
        nationalIdTypeCodes.put("Refugee ID", 3);
        nationalIdTypeCodes.put("Passport", 4);
        nationalIdTypeCodes.put("Foreigner's ID", 5);
        nationalIdTypeCodes.put("Registration Number (For companies only)", 6);
        nationalIdTypeCodes.put("Other Gov Institutions(BNR,RDB,etc.)", 7);
 
        return nationalIdTypeCodes;
    }

    public HashMap<String, String> getMaritalStatusCodes() {

        HashMap<String, String> maritalStatusCodes = new HashMap<>();
        maritalStatusCodes.put("Married", "001");
        maritalStatusCodes.put("Widowed", "003");
        maritalStatusCodes.put("Separated", "004");
        maritalStatusCodes.put("Divorced", "005");
        maritalStatusCodes.put("Single", "006");
        maritalStatusCodes.put("Not Applicable (For Corporates)", "NA");

        return maritalStatusCodes;
    }

    public HashMap<String, String> getGenderCodes() {

        HashMap<String, String> genderCodes = new HashMap<>();
        genderCodes.put("Male", "M");
        genderCodes.put("Female", "F");
        genderCodes.put("Corporate", "C");

        return genderCodes;
    }

    public HashMap<String, String> getVisionSBUCodes() {

        HashMap<String, String> visionSBUCodes = new HashMap<>();
        visionSBUCodes.put("Micro Enterprises", "MCEOTHR");
        visionSBUCodes.put("Small Enterprises", "SMLOTHR");
        visionSBUCodes.put("Medium Enterprises", "MEDOTHR");
        visionSBUCodes.put("Large Enterprises", "LRGOTHR");
        visionSBUCodes.put("Retail or Individuals", "RETL");
        visionSBUCodes.put("NGOs, charity/welfare organisations", "NGO");
        visionSBUCodes.put("Business Groups/Community", "SAGRP");
        visionSBUCodes.put("Others", "OTHER");

        return visionSBUCodes;
    }

    public HashMap<String, Integer> getAccountStatusCodes() {

        HashMap<String, Integer> accountStatusCodes = new HashMap<>();

        accountStatusCodes.put("Active", 0);
        accountStatusCodes.put("Inactive", 1);
        accountStatusCodes.put("Closed", 2);
        accountStatusCodes.put("Dormant", 3);
        accountStatusCodes.put("Expired", 4);
        accountStatusCodes.put("Matured", 5);
        accountStatusCodes.put("Deleted", 9);
     
        return accountStatusCodes;
    }

    public HashMap<String, String> getAccountTypeCodes() {

        HashMap<String, String> accountTypeCodes = new HashMap<>();
        accountTypeCodes.put("Current Account", "MCEOTHR");
        accountTypeCodes.put("Saving Account", "SBA");
        accountTypeCodes.put("Term Deposit Account", "TDA");
        accountTypeCodes.put("Security Deposit Account", "SED");
        accountTypeCodes.put("Loan Account", "LAA");
        accountTypeCodes.put("Office Account/ Internal Account/ Accounts owned by the stakeholder itself", "OAB");
        accountTypeCodes.put("Insurance Policy", "IP");
        accountTypeCodes.put("Trust Account", "TRUSTAC");
        
        return accountTypeCodes;
    }

    public HashMap<String, String> getFreezeStatusCodes() {

        HashMap<String, String> freezeStatusCodes = new HashMap<>();
        freezeStatusCodes.put("Debit Freeze", "D");
        freezeStatusCodes.put("Credit Freeze", "C");
        freezeStatusCodes.put("Debit/Credit Freeze", "Y");
        freezeStatusCodes.put("Not Freeze", "N");
       
        return freezeStatusCodes;
    }

    public HashMap<String, String> getPublicSectorCodes() {

        HashMap<String, String> publicSectorCodes = new HashMap<>();
        publicSectorCodes.put("Treasury", "A1");
        publicSectorCodes.put("Ministries", "A2");
        publicSectorCodes.put("Government Projects", "A3");
        publicSectorCodes.put("Joint Projects", "A4");
        publicSectorCodes.put("Special Funds", "A5");
        publicSectorCodes.put("Counterpart Funds", "A6");
        publicSectorCodes.put("Offices", "A71");
        publicSectorCodes.put("Hospital And Community Health Center", "A72");
        publicSectorCodes.put("Institutes And Research Center", "A73");
        publicSectorCodes.put("Others", "A74");
        publicSectorCodes.put("Province", "B1");
        publicSectorCodes.put("Districts", "B2");
        publicSectorCodes.put("Sectors", "B3");
        publicSectorCodes.put("RSSB", "C1");
        publicSectorCodes.put("MMI", "C2");
        publicSectorCodes.put("Related Public Companies", "D1");
        publicSectorCodes.put("Public Companies", "D2");
        publicSectorCodes.put("Other Sectors", "O1");

        return publicSectorCodes;
    }

    public HashMap<String, String> getInstitutionalSectorCodes() {

        HashMap<String, String> institutionalSectorCodes = new HashMap<>();
        institutionalSectorCodes.put("Investment Banks", "INVB");
        institutionalSectorCodes.put("Development Bank", "DEVB");
        institutionalSectorCodes.put("Micro Finance Bank", "MFB");
        institutionalSectorCodes.put("Cooperative Bank", "COOPB");
        institutionalSectorCodes.put("Housing Bank & Assimilated", "BHRA");
        institutionalSectorCodes.put("MFI/SACCO (Deposit Taking)", "MFI");

        return institutionalSectorCodes;
    }

    public HashMap<String, String> getAccountOwnershipCodes() {

        HashMap<String, String> accountOwnerShipCodes = new HashMap<>();
        accountOwnerShipCodes.put("Individual or Corporate", "O");
        accountOwnerShipCodes.put("Joint Application", "J");
        accountOwnerShipCodes.put("Sole proprietorship in which the owner is account owner", "S");
        accountOwnerShipCodes.put("By one of the partners", "P");
        accountOwnerShipCodes.put("Group Owners", "G");
        
        return accountOwnerShipCodes;
    }

    public HashMap<String, String> getPerformanceClassCodes() {

        HashMap<String, String> performanceClassCodes = new HashMap<>();
        performanceClassCodes.put("Normal loans", "NL");
        performanceClassCodes.put("Watch loans", "WL");
        performanceClassCodes.put("Substandards loans", "SL");
        performanceClassCodes.put("Doubtful loans", "DL");
        performanceClassCodes.put("Loss loans", "LL");
        performanceClassCodes.put("Writtern Off", "WO");

        return performanceClassCodes;
    }

    public HashMap<String, Integer> getCreditCategoryCodes() {

        HashMap<String, Integer> creditCategoryCodes = new HashMap<>();

        creditCategoryCodes.put("Cash Adavance", 10);
        creditCategoryCodes.put("Working Capital Credit", 11);
        creditCategoryCodes.put("Inventory Credit", 20);
        creditCategoryCodes.put("Discount Facility", 21);
        creditCategoryCodes.put("Bridging Credit", 22);
        creditCategoryCodes.put("Season Credit", 34);
        creditCategoryCodes.put("Personal Loan", 40);
        creditCategoryCodes.put("Vehicle Loan", 50);
        creditCategoryCodes.put("Residential Mortgage Loans", 60);
        creditCategoryCodes.put("Commercial Mortgages/Real Estate Leasing", 64);
        creditCategoryCodes.put("Leasing", 68);
        creditCategoryCodes.put("Fixed-Asset Loan", 70);
        creditCategoryCodes.put("Equipment Loans", 71);
        creditCategoryCodes.put("Other cash loans", 72);
        creditCategoryCodes.put("Undrawn line of credit", 73);
        creditCategoryCodes.put("Documentary Credit", 80);
        creditCategoryCodes.put("Caution", 82);
        creditCategoryCodes.put("Guarantee", 83);
        creditCategoryCodes.put("Acceptance", 84);
        creditCategoryCodes.put("Other Commitments", 89);

        return creditCategoryCodes;
    
    }

    public HashMap<String, String> getEconomicSectorCodes() {

        HashMap<String, String> economicSectorCodes = new HashMap<>();
        economicSectorCodes.put("Agriculture, forestry and fishing", "A");
        economicSectorCodes.put("Mining and quarrying", "B");
        economicSectorCodes.put("Manufacturing", "C");
        economicSectorCodes.put("Electricity, gas, steam and air conditioning supply", "D");
        economicSectorCodes.put("Water supply; sewerage, waste management and remediation activities", "E");
        economicSectorCodes.put("Construction", "F");
        economicSectorCodes.put("Wholesale and retail trade; repair of motor vehicles and motorcycles", "G");
        economicSectorCodes.put("Transportation and storage", "H");
        economicSectorCodes.put("Accommodation and food service activities", "I");
        economicSectorCodes.put("Information and communication", "J");
        economicSectorCodes.put("Financial and insurance activities", "K");
        economicSectorCodes.put("Real estate activities", "L");
        economicSectorCodes.put("Professional, scientific and technical activities", "M");
        economicSectorCodes.put("Administrative and support service activities", "N");
        economicSectorCodes.put("Not Applicable", "NA");
        economicSectorCodes.put("Public administration and defence; compulsory social security", "O");
        economicSectorCodes.put("Education", "P");
        economicSectorCodes.put("Human health and social work activities", "Q");
        economicSectorCodes.put("Arts, entertainment and recreation", "R");
        economicSectorCodes.put("Other service activities", "S");
        economicSectorCodes.put("Activities of households as employers; undifferentiated goods- and services-prod", "T");
        economicSectorCodes.put("Activities of extraterritorial organizations and bodies", "A2");

        return economicSectorCodes;
    }

    public HashMap<String, String> getLoanApplicationStastusCodes(String applicationStatus) {
        HashMap<String, String> loanApplicationCodes = new HashMap<>();

        loanApplicationCodes.put("Approved", "A");
        loanApplicationCodes.put("Rejected", "R");

        return loanApplicationCodes;
    }

    public HashMap<String, Integer> getInterestRateMethodCodes(String interestRate) {

        HashMap<String, Integer> interestRateMethodCodes = new HashMap<>();
        interestRateMethodCodes.put("Flat", 1);
        interestRateMethodCodes.put("Declining", 2);
        interestRateMethodCodes.put("Floating", 3);
        interestRateMethodCodes.put("Not Applicable", 9999);

        return interestRateMethodCodes;
    }

    public HashMap<String, Integer> getContractStatusCodes(String contractStatus) {

        HashMap<String, Integer> contractStatusCodes = new HashMap<>();
        contractStatusCodes.put("Active", 0);
        contractStatusCodes.put("Pre-Matured", 1);
        contractStatusCodes.put("Matured", 2);
        contractStatusCodes.put("Applied", 3);
        contractStatusCodes.put("Rejected", 4);
        contractStatusCodes.put("Writeoff", 6);

        return contractStatusCodes;
    }

    public HashMap<String, Integer> getLoanApplicationTypeCodes(String applicationType) {

        HashMap<String, Integer> loanApplicationTypeCodes = new HashMap<>();
        loanApplicationTypeCodes.put("New Loan Application", 1);
        loanApplicationTypeCodes.put("Application to modify existing loan", 2);

        return loanApplicationTypeCodes;
    }

    public String getInterestRateMethod(String interestMethodCode) {
        switch (interestMethodCode) {
            case "1":
                return "Flat";
            case "2":
                return "Declining";
            case "3":
                return "Floating";
            case "9999":
                return "Not Applicable";
            default:
                return "";
        }
    }

    public String getContractStatus(String contractStatusCode) {
        switch (contractStatusCode) {
            case "0":
                return "Active";
            case "1":
                return "Pre-Matured";
            case "2":
                return "Matured";
            case "3":
                return "Applied";
            case "4":
                return "Rejected";
            case "6":
                return "Writeoff";
            default:
                return "";
        }
    }

    public boolean isEmailValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

}
