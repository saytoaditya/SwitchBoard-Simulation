public enum BookFormat {
    HARDCOVER,
    PAPERBACK,
    AUDIO_BOOK,
    EBOOK,
    NEWSPAPER,
    MAGAZINE,
    JOURNAL
  }
  public enum BookStatus {
    AVAILABLE,
    RESERVED,
    LOANED,
    LOST
  }
  
  public enum ReservationStatus{
    WAITING,
    PENDING,
    CANCELED,
    NONE
  }
  
  public enum AccountStatus{
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    NONE
  }
  
  public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
  }
  
  public class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
  }
  
  public abstract class Account{
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;
 
  public  boolean  resetPassword(); 
}

    public class Librarian extends Account{
        public boolean addBookItem();
        public boolean blockMember();
        public boolean unBlockMember(Member member);
    }

    public class Member extends Account{
        private Date dateOfMembership;
        private int totalBooksCheckedout;
      
        public int getTotalBooksCheckedout();
    }
 