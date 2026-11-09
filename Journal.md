# Journal

## Phase 1
In this phase, I created a NeuralMod class and used an ArrayList to store five mods. I also added a toString() method to display their details.

I learned that an ArrayList can grow or shrink, while a regular array has a fixed size.

## Phase 2
In this phase, I used the Comparable interface and compareTo() method to sort neural mods by processing speed from lowest to highest. I learned that natural order is the default way objects are sorted, and Collections.sort() uses this order.

## Phase 3

In this phase, I used Comparator to sort mods by compatibility without changing their natural order. I used Integer.compare() with the values reversed to sort from highest to lowest.

## Phase 4

In this phase, I updated compareTo() to sort by speed first, compatibility second, and name last. If two mods have the same speed, the program compares compatibility. If both are equal, it sorts their names alphabetically.
