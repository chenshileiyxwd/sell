package testThread.system12306;

/**
 * @ClassName Ticket
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/2 22:08
 * @Version 1.0
 **/
public class Ticket {
    private String start;//起始站点
    private String destination;//终点站名
    private Float price;//价格

    public Ticket() {
    }

    public Ticket(String start, String destination, Float price) {
        this.start = start;
        this.destination = destination;
        this.price = price;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}
