package ConsoleUI;

public enum BorderType {
  DOTTED("·"),
  ASTERISK("*"),
  SOFT_BLOCK("▒"),
  BLACK_BLOCK("█"),
  SMALL_BLACK_BLOCK("■");

  private final String symbol;

  BorderType(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
}
