package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote object fromthe value following the pattern storeName:price:discountCode
     *
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @aram value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }
}
