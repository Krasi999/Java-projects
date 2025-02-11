package EX2;

public class Company {
    private String name;
    private String date;
    private String code;

    public Company(String name, String date, String code) {
        this.name = name;
        this.date = date;
        this.code = code;
        setCode(code);
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public String getCode(){
        return code;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setCode(String code){
        if(code.length() > 10){
            System.out.println("The code is too long!");
        }
        this.code = code;
    }
}

