package HomeWork10_12_And_10_14;

public class PieceWorker extends Employee {


    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String secondName, String socialSecurityNumber, double wage, int pieces, int day, int month, int year) {
        super(firstName, secondName, socialSecurityNumber, day, month, year);

        setPieces(pieces);
        setWage(wage);
    }


    @Override
    public double earnings() {
        return getWage() * getPieces() + super.earnings();
    }

    public void setWage(double wage) {
        if (wage < 0)
            throw new IllegalArgumentException("Wage can be negative!");
        this.wage = wage;
    }

    public void setPieces(int pieces) {
        if (pieces < 0)
            throw new IllegalArgumentException("Pieces can be negative! ");
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        return "Piece Worker employee " + super.toString() + "\nWage of piece " + getWage()
                + "\nPieces " + getPieces();
    }
}
