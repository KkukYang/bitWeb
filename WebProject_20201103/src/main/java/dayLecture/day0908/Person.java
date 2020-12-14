package dayLecture.day0908;

public class Person {
    private String name;
    private int year;
    private double height;
    private double weight;

    public Person() {
        super();
    }

    public Person(String name, int year, double height, double weight) {
        super();
        this.name = name;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name:" + name + ", year:" + year + ", height:" + height + ", weight:" + weight;
    }

    public String getddi() {
        String ddi = "";
        String[] arrddi = {"원숭이", "닭", "개,", " 돼지", " 쥐", " 소", " 범", " 토끼", " 용", " 뱀", " 말", " 양"};
        ddi = arrddi[year % 12].trim();
        return ddi;
    }

    public String getPungga() {
        String msg = "";
        double st_weight = (height - 100) * 0.9;
        double diff = st_weight - weight;
        if (diff >= 5.0) {
            msg = "허약";
        } else if (diff < -5.0) {
            msg = "비만";
        } else {
            msg = "정상";
        }

        return msg;
    }
}
