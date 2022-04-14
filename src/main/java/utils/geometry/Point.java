package utils.geometry;

import java.util.Objects;

public class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean isToTheRightOf(Point p) {
    return x + 1 == p.getX() && y == p.getY();
  }

  public boolean isToTheLeftOf(Point p) {
    return x - 1 == p.getX() && y == p.getY();
  }

  public boolean isAbove(Point p) {
    return x == p.getX() && y - 1 == p.getY();
  }

  public boolean isBelow(Point p) {
    return x == p.getX() && y + 1 == p.getY();
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    return "Point: x: " + x + " y: " + y;
  }
}
