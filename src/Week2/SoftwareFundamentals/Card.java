package Week2.SoftwareFundamentals;

/**
 * A simple file to model Card class.
 *
 * @author Ali Hassan, May 15 2019
 * 
 * 
 * Adding a line to test commit
 */
public class Card {

    private String suit;//Hearts, Spades, Clubs, Diamonds
    private int value; //1-13

    /**
     * A constructor to instantiate Card class.
     *
     * @param suit
     * @param value
     */
    public Card(String suit, int value) {
        if (suit.equalsIgnoreCase("Hearts") || suit.equalsIgnoreCase("Clubs")
                || suit.equalsIgnoreCase("Spades") || suit.equalsIgnoreCase("Diamonds")) {
            this.suit = suit;
        } else {
            System.out.println("Invalid suit, try again");
        }
        if (value < 1 || value > 13) {
            System.out.println("Invalid value");
        } else {
            this.value = value;
        }

    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
