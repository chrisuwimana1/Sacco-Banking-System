/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.regex.Pattern;

/**
 *
 * @author chris
 */
public class Helper {

    public Helper() {

    }

    public String getVillageCode(String village) {
        switch (village) {
            case "Amajyambere":
                return "OL01001097";
            case "Bukinanyana":
                return "OL01001099";
            case "Cyimana":
                return "OL01001101";
            case "Gataba":
                return "OL01001103";
            case "Itetero":
                return "OL01001105";
            case "Kabare":
                return "OL01001107";
            case "Kamuhire":
                return "OL01001109";
            case "Karukamba":
                return "OL01001111";
            case "Nyagacyamo":
                return "OL01001113";
            case "Rwinzovu":
                return "OL01001115";
            case "Urugwiro":
                return "OL01001117";
            case "Uruhongore":
                return "OL01001119";
            case "Agasaro":
                return "OL01001121";
            case "Gasharu":
                return "OL01001123";
            case "Inkingi":
                return "OL01001125";
            case "Kanserege":
                return "OL01001127";
            case "Kigugu":
                return "OL01001129";
            case "Ruganwa":
                return "OL01001131";
            case "Umuco":
                return "OL01001133";
            case "Umutekano":
                return "OL01001135";
            case "Urugero":
                return "OL01001137";
            case "Urwibutso":
                return "OL01001139";
            case "Amahoro":
                return "OL01001141";
            case "Bwiza":
                return "OL01001143";
            case "Ihuriro":
                return "OL01001145";
            case "Ineza":
                return "OL01001147";
            case "Inyange":
                return "OL01001149";
            case "Iriba":
                return "OL01001151";
            case "Kabagari":
                return "OL01001153";
            case "Ubumwe":
                return "OL01001155";
            case "Umutako":
                return "OL01001157";
            case "Urukundo":
                return "OL01001159";
            case "Virunga":
                return "OL01001161";
            default:
                return "";
        }
    }

    public String getEconomicSubSectorISICCode(String economicSubSector) {

        switch (economicSubSector.trim()) {
            case "Growing of rice":
                return "0112";
            case "Growing of vegetables and melons, roots and tubers":
                return "0113";
            case "Raising of cattle and buffaloes":
                return "0141";
            case "Raising of sheep and goats":
                return "0144";
            case "Raising of swine/pigs":
                return "0145";
            case "Raising of poultry":
                return "0146";
            case "Mixed farming":
                return "0150";
            case "Manufacture of dairy products":
                return "1050";
            case "Manufacture of other food products n.e.c.":
                return "1079";
            case "Weaving of textiles":
                return "1312";
            case "Repair of machinery":
                return "3312";
            case "Electrical installation":
                return "4321";
            case "Wholesale of food, beverages and tobacco":
                return "4630";
            case "Wholesale of textiles, clothing and footwear":
                return "4631";
            case "Wholesale of other household goods":
                return "4649";
            case "Wholesale of other machinery and equipment":
                return "4659";
            case "Restaurants and mobile food service activities":
                return "5610";
            case "Beverage serving activities":
                return "5630";
            case "Accounting, bookkeeping and auditing activities; tax consultancy":
                return "6920";
            case "Higher education":
                return "8530";
            case "Sports and recreation education":
                return "8541";
            case "Cultural education":
                return "8542";
            case "Other education n.e.c.":
                return "8549";
            case "Hospital activities":
                return "8610";
            case "Activities of religious organizations":
                return "9491";
            case "Other personal service activities n.e.c.":
                return "9609";
            default:
                return "";
        }

    }

    public int getNaicsCode(String naicscode) {

        switch (naicscode.trim()) {
            case "Default NAICS Code":
                return 999999;
            default:
                return -1;
        }
    }

    public int getOccupationCode(String occupationcode) {
        switch (occupationcode.trim()) {

            case "Commissioned armed forces officers":
                return 1010;
            case "Non-commissioned armed forces officers":
                return 2010;
            case "Armed forces occupations, other ranks":
                return 3010;
            case "Managing directors and chief executives":
                return 1120;
            case "Finance managers":
                return 1211;
            case "Agricultural and forestry production managers":
                return 1311;
            case "Financial and insurance services branch managers":
                return 1346;
            case "Hotel managers":
                return 1411;
            case "Restaurant managers":
                return 1412;
            case "Civil engineers":
                return 2142;
            case "Environmental engineers":
                return 2143;
            case "Mechanical engineers":
                return 2144;
            case "Electronics engineers":
                return 2152;
            case "Generalist medical practitioners ":
                return 2211;
            case "Specialist medical practitioners ":
                return 2212;
            case "Nursing professionals":
                return 2221;
            case "Traditional and complementary medicine professionals":
                return 2230;
            case "Veterinarians":
                return 2250;
            case "Pharmacists":
                return 2262;
            case "University and higher education teachers":
                return 2310;
            case "Secondary education teachers":
                return 2330;
            case "Primary school teachers":
                return 2341;
            case "Accountants":
                return 2411;
            case "Lawyers":
                return 2611;
            case "Judges":
                return 2612;
            case "Religious professionals":
                return 2636;
            case "Journalists":
                return 2642;
            case "Musicians, singers and composers":
                return 2652;
            case "Religious associate professionals":
                return 3413;
            case "Athletes and sports players":
                return 3421;
            case "Sports coaches, instructors and officials":
                return 3422;
            case "Photographers":
                return 3431;
            case "Secretaries":
                return 4120;
            case "Bank tellers and related clerks":
                return 4211;
            case "Receptionists":
                return 4226;
            case "Cooks":
                return 5120;
            case "Waiters":
                return 5131;
            case "Bartenders":
                return 5132;
            case "Hairdressers":
                return 5141;
            case "Shop keepers":
                return 5221;
            case "Cashiers and ticket clerks":
                return 5230;
            case "Police officers":
                return 5412;
            case "Prison guards":
                return 5413;
            case "Security guards":
                return 5414;
            case "Field crop and vegetable growers":
                return 6111;
            case "Livestock and dairy producers":
                return 6121;
            case "Poultry producers":
                return 6122;
            case "House builders":
                return 7111;
            case "Potters and related workers":
                return 7314;
            case "Handicraft workers in wood, basketry and related materials":
                return 7317;
            case "Handicraft workers in textile, leather and related materials":
                return 7318;
            case "Building and related electricians":
                return 7411;
            case "Tailors, dressmakers, furriers and hatters":
                return 7531;
            case "Shoemakers and related workers":
                return 7536;
            case "Motorcycle drivers":
                return 8321;
            case "Car, taxi and van drivers":
                return 8322;
            case "Bus and tram drivers":
                return 8331;
            case "Heavy truck and lorry drivers":
                return 8332;
            case "Domestic cleaners and helpers":
                return 9111;
            case "Cleaners and helpers in offices, hotels and other establishments":
                return 9112;
            case "Crop farm labourers":
                return 9211;
            case "Livestock farm labourers":
                return 9212;
            case "Garbage and recycling collectors":
                return 9611;
            case "Not Applicable":
                return 9999;
            case "Others in General":
                return 99;
            case "Unemployed":
                return 9998;
            default:
                return -1;
        }
    }

    public int getIncomeRangeCode(String incomerange) {

        switch (incomerange.trim()) {
            case "0 -30,000":
                return 1;
            case "30,001 - 100,000":
                return 2;
            case "101,000 - 170,000":
                return 3;
            case "171,000 - 230,000":
                return 4;
            case "231,000 - 300,000":
                return 5;
            case "301,000 - 370,000":
                return 6;
            case "371,000 - 440,000":
                return 7;
            case "441,000 - 510,000":
                return 8;
            case "511,000 - 580,000":
                return 9;
            case "581,000 - 650,000":
                return 10;
            case "651,000 - 720,000":
                return 11;
            case "721,000 - 790,000":
                return 12;
            case "791,000 - 860,000":
                return 13;
            case "861,000 - 930,000":
                return 14;
            case "931,000 - 1,000,000":
                return 15;
            case "1,001,000 - 1,070,000":
                return 16;
            case "1,071,000 - 1,140,000":
                return 17;
            case "1,141,000 - 1,210,000":
                return 18;
            case "1,211,000 - 1,280,000":
                return 19;
            case "1,281,000 - 1,350,000":
                return 20;
            case "1,351,000 - 1,420,000":
                return 21;
            case "1,421,000 - 1,490,000":
                return 22;
            case "1,491,000 - 1,560,000":
                return 23;
            case "1,561,000 - 1,630,000":
                return 24;
            case "1,631,000 - 1,700,000":
                return 25;
            case "1,701,000 - 1,770,000":
                return 26;
            case "1,771,000 - 1,840,000":
                return 27;
            case "1,841,000 - 1,910,000":
                return 28;
            case "1,911,000 - 1,980,000":
                return 29;
            case "1,981,000  and  above":
                return 30;
            default:
                return -1;

        }
    }

    public int getCustomerStatusCode(String customerstatuscode) {

        switch (customerstatuscode.trim()) {
            case "Active":
                return 0;
            case "Inactive":
                return 0;
            case "Delete":
                return 0;
            default:
                return -1;
        }
    }

    public int getLegalStatusCode(String legalstatuscode) {
        switch (legalstatuscode.trim()) {
            case "Sole Trader":
                return 1;
            case "Partnership":
                return 2;
            case "Private Company":
                return 3;
            case "Public Company":
                return 4;
            case "Trustee":
                return 5;
            case "Co operatives":
                return 6;
            case "Non-Profit Organization":
                return 7;
            default:
                return -1;
        }
    }

    public String getIncomeFrequencyCode(String incomefrequency) {

        switch (incomefrequency.trim()) {
            case "Monthly":
                return "M";
            case "Quarterly":
                return "Q";
            case "Annual":
                return "A";
            case "Daily":
                return "D";
            case "Weekly":
                return "M";
            case "Not Applicable":
                return "NA";
            default:
                return "";
        }
    }

    public int getRelationshipTypeCode(String relationshiptype) {

        switch (relationshiptype.trim()) {
            case "Spouse":
                return 1;
            case "Husband":
                return 2;
            case "Wife":
                return 3;
            case "Father":
                return 4;
            case "Mother":
                return 5;
            case "Son":
                return 6;
            case "Daughter":
                return 7;
            case "Brother":
                return 8;
            case "Sister":
                return 9;
            case "Grandfather":
                return 10;
            case "Grandmother":
                return 11;
            case "Grandson":
                return 12;
            case "Granddaughter":
                return 13;
            case "Uncle":
                return 14;
            case "Aunt":
                return 15;
            case "Cousin":
                return 16;
            case "Nephew":
                return 17;
            case "Niece":
                return 18;
            case "Father-in-law":
                return 19;
            case "Mother-in-law":
                return 20;
            case "Brother-in-law":
                return 21;
            case "Sister-in-law":
                return 22;
            case "Self":
                return 23;
            case "Direct or indirect relationship with the bank":
                return 24;
            case "Non Related Party":
                return 25;
            default:
                return -1;
        }
    }

    public int getEducationCode(String educationinput) {

        switch (educationinput) {
            case "PHD":
                return 1;
            case "Masters":
                return 2;
            case "Bachelors Degree":
                return 3;
            case "Diploma (A2 or A1 level)":
                return 4;
            case "School attendace below A2 level":
                return 5;
            case "High School":
                return 6;
            case "Primary School":
                return 7;
            case "Below Primary":
                return 8;
            default:
                return -1;
        }
    }

    public String getResidenceTypeCode(String residenceType) {

        switch (residenceType.trim()) {
            case "Owner":
                return "O";
            case "Tenant":
                return "T";
            default:
                return "";
        }
    }

    public int getNationalIdTypeCode(String id_type_code) {

        switch (id_type_code.trim()) {
            case "Driving_License":
                return 1;
            case "National_ID  (Mandatory for Rwandan Nationals)":
                return 2;
            case "Refugee ID":
                return 3;
            case "Passport":
                return 4;
            case "Foreigner's ID":
                return 5;
            case "Registration Number (For companies only)":
                return 6;
            case "Other Gov Institutions(BNR,RDB,etc.)":
                return 7;
            default:
                return -1;
        }
    }

    public String getMaritalStatusCode(String maritalstatus) {

        switch (maritalstatus.trim()) {
            case "Married":
                return "001";
            case "Widowed":
                return "003";
            case "Separated":
                return "004";
            case "Divorced":
                return "005";
            case "Single":
                return "006";
            case "Not Applicable (For Corporates)":
                return "NA";
            default:
                return "";
        }
    }

    public String getGenderCode(String gender) {

        switch (gender.trim()) {
            case "Male":
                return "M";
            case "Female":
                return "F";
            case "Corporate":
                return "C";
            default:
                return "";
        }
    }

    public String getVision_SBU_Code(String segment) {

        switch (segment.trim()) {
            case "Micro Enterprises":
                return "MCEOTHR";
            case "Small Enterprises":
                return "SMLOTHR";
            case "Medium Enterprises":
                return "MEDOTHR";
            case "Large Enterprises":
                return "LRGOTHR";
            case "Retail or Individuals":
                return "RETL";
            case "NGOs, charity/welfare organisations":
                return "NGO";
            case "Business Groups/Community":
                return "SAGRP";
            case "Others":
                return "OTHER";
            default:
                return "";

        }
    }

    public int getAccountStatusCode(String accountStatus) {

        switch (accountStatus.trim()) {
            case "Active":
                return 0;
            case "Inactive":
                return 1;
            case "Closed":
                return 2;
            case "Dormant":
                return 3;
            case "Expired":
                return 4;
            case "Matured":
                return 5;
            case "Deleted":
                return 9;
            default:
                return -1;
        }
    }

    public String getAccountTypeCode(String accountType) {
        switch (accountType) {
            case "Current Account":
                return "CAA";
            case "Saving Account":
                return "SBA";
            case "Term Deposit Account":
                return "TDA";
            case "Security Deposit Account":
                return "SED";
            case "Loan Account":
                return "LAA";
            case "Office Account/ Internal Account/ Accounts owned by the stakeholder itself":
                return "OAB";
            case "Insurance Policy":
                return "IP";
            case "Trust Account":
                return "TRUSTAC";
            default:
                return "";
        }
    }

    public String getFreezeStatusCode(String freezeStatus) {
        switch (freezeStatus) {
            case "Debit Freeze":
                return "D";
            case "Credit Freeze":
                return "C";
            case "Debit/Credit Freeze":
                return "Y";
            case "Not Freeze":
                return "N";
            default:
                return "";
        }
    }

    public String getPublicSectorCode(String publicSector) {
        switch (publicSector.trim()) {
            case "Treasury":
                return "A1";
            case "Ministries":
                return "A2";
            case "Government Projects":
                return "A3";
            case "Joint Projects":
                return "A4";
            case "Special Funds":
                return "A5";
            case "Counterpart Funds":
                return "A6";
            case "Offices":
                return "A71";
            case "Hospital And Community Health Center":
                return "A72";
            case "Institutes And Research Centers":
                return "A73";
            case "Others":
                return "A74";
            case "Province":
                return "B1";
            case "Districts":
                return "B2";
            case "Sectors":
                return "B3";
            case "RSSB":
                return "C1";
            case "MMI":
                return "C2";
            case "Related Public Companies":
                return "D1";
            case "Public Companies":
                return "D2";
            case "Other Sectors":
                return "O1";
            default:
                return "";
        }
    }

    public String getInstitutionalSectorCode(String institutionalSector) {
        switch (institutionalSector.trim()) {
            case "Investment Banks":
                return "INVB";
            case "Development Bank":
                return "DEVB";
            case "Micro Finance Bank":
                return "MFB";
            case "Cooperative Bank":
                return "COOPB";
            case "Housing Bank & Assimilated":
                return "BHRA";
            case "MFI/SACCO (Deposit Taking)":
                return "MFI";
            default:
                return "";
        }
    }

    public String getAccountOwnershipCode(String accountOwnership) {
        switch (accountOwnership.trim()) {
            case "Individual or Corporate":
                return "O";
            case "Joint Application":
                return "J";
            case "Sole proprietorship in which the owner is account owner":
                return "S";
            case "By one of the partners":
                return "P";
            case "Group Owners":
                return "G";
            default:
                return "";
        }
    }

    public String getPerformanceClassCode(String performanceClass) {
        switch (performanceClass.trim()) {
            case "Normal loans":
                return "NL";
            case "Watch loans":
                return "WL";
            case "Substandards loans":
                return "SL";
            case "Doubtful loans":
                return "DL";
            case "Loss loans":
                return "LL";
            case "Writtern Off":
                return "WO";
            default:
                return "";
        }
    }

    public int getCreditCategoryCode(String creditCategory) {
        switch (creditCategory.trim()) {
            case "Cash Adavance":
                return 10;
            case "Working Capital Credit":
                return 11;
            case "Inventory Credit":
                return 20;
            case "Discount Facility":
                return 21;
            case "Bridging Credit":
                return 22;
            case "Season Credit":
                return 34;
            case "Personal Loan":
                return 40;
            case "Vehicle Loan":
                return 50;
            case "Residential Mortgage Loans":
                return 60;
            case "Commercial Mortgages/Real Estate Leasing":
                return 64;
            case "Leasing":
                return 68;
            case "Fixed-Asset Loan":
                return 70;
            case "Equipment Loans":
                return 71;
            case "Other cash loans":
                return 72;
            case "Undrawn line of credit":
                return 73;
            case "Documentary Credit":
                return 80;
            case "Caution":
                return 82;
            case "Guarantee":
                return 83;
            case "Acceptance":
                return 84;
            case "Other Commitments":
                return 89;
            default:
                return -1;
        }
    }

    public String getEconomicSectorCode(String economicSector) {

        switch (economicSector.trim()) {
            case "Agriculture, forestry and fishing":
                return "A";
            case "Mining and quarrying":
                return "B";
            case "Manufacturing":
                return "C";
            case "Electricity, gas, steam and air conditioning supply":
                return "D";
            case "Water supply; sewerage, waste management and remediation activities":
                return "E";
            case "Construction":
                return "F";
            case "Wholesale and retail trade; repair of motor vehicles and motorcycles":
                return "G";
            case "Transportation and storage":
                return "H";
            case "Accommodation and food service activities":
                return "I";
            case "Information and communication":
                return "J";
            case "Financial and insurance activities":
                return "K";
            case "Real estate activities":
                return "L";
            case "Professional, scientific and technical activities":
                return "M";
            case "Administrative and support service activities":
                return "N";
            case "Not Applicable":
                return "NA";
            case "Public administration and defence; compulsory social security":
                return "O";
            case "Education":
                return "P";
            case "Human health and social work activities":
                return "Q";
            case "Arts, entertainment and recreation":
                return "R";
            case "Other service activities":
                return "S";
            case "Activities of households as employers; undifferentiated goods- and services-prod":
                return "T";
            case "Activities of extraterritorial organizations and bodies":
                return "U";
            default:
                return "";
        }
    }

    public String getLoanApplicationStastusCode(String applicationStatus) {

        switch (applicationStatus) {
            case "Approved":
                return "A";
            case "Rejected":
                return "R";
            default:
                return "";
        }
    }

    public int getInterestRateMethodCode(String interestRate) {
        switch (interestRate.trim()) {
            case "Flat":
                return 1;
            case "Declining":
                return 2;
            case "Floating":
                return 3;
            case "Not Applicable":
                return 9999;
            default:
                return -1;
        }
    }

    public int getContractStatusCode(String contractStatus) {
        switch (contractStatus.trim()) {
            case "Active":
                return 0;
            case "Pre-Matured":
                return 1;
            case "Matured":
                return 2;
            case "Applied":
                return 3;
            case "Rejected":
                return 4;
            case "Writeoff":
                return 6;
            default:
                return -1;
        }
    }

    public int getLoanApplicationTypeCode(String applicationType) {

        switch (applicationType) {
            case "New Loan Application":
                return 1;
            case "Application to modify existing loan":
                return 2;
            default:
                return -1;
        }
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
