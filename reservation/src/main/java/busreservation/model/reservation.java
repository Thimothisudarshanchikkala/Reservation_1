package busreservation.model;

public class reservation {
    private Long busno;
    private String source;
    private String destination;
    private String seattype;
    private Long availableseats;
    private Long totalseats;
    private Double price;


    // Constructors
    public reservation() {}
    
    public reservation( Long busno, String source, String destination, String seattype, Long availableseats, Long totalseats, Double price) {
        this.busno = busno;
        this.source = source;
        this.destination = destination;
        this.seattype = seattype;
        this.availableseats = availableseats;
        this.totalseats = totalseats;
        this.price = price;
    }

    // Getters and Setters
    public Long getBusno() { return busno; }
    public void setBudno(Long busno) { this.busno = busno; }
    public String getSourse() { return source; }
    public void setSouece(String name) { this.source = source; }
    public String getDestination() { return destination; }
    public void setDestination(String email) { this.destination = destination; }
    public String getSeattype() { return seattype; }
    public void setSeattype(Double salary) { this.seattype = seattype; }
    public String getAvailableseats() { return availableseats; }
    public void setAvailableseats(String department) { this.availableseats = availableseats; }
    public String getTotalseats() { return totalseats; }
    public void setTotalseats(String department) { this.totalseats = totalseats; }
    public String getPrice() { return price; }
    public void setPrice(String department) { this.price = price; }
    
}
