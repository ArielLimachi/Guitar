package ConsoleUI;

import utils.geometry.Point;

public class Cell {

  Point coordinate;
  BorderType border;

  StringBuilder content;

  public Cell(Point coordinate, String content, BorderType border) {
    this.coordinate = coordinate;
    this.border = border;

    build(content);
  }

  public StringBuilder get() {
    return content;
  }

  public void setBorder(BorderType borderType) {
    border = borderType;
  }

  public void setContent(String content){
    build(content);
  }

  public void build(String content) {
    this.content = new StringBuilder();
    for (int i = 0; i < content.length()+2; i++) {
      this.content.append(border.getSymbol());
    }
    this.content.append("\n");
    this.content.append(border.getSymbol()+content+border.getSymbol());
    this.content.append("\n");
    for (int i = 0; i < content.length()+2; i++) {
      this.content.append(border.getSymbol());
    }
  }

  public Point getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(Point coordinate) {
    this.coordinate = coordinate;
  }
}
