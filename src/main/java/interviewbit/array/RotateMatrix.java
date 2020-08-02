package interviewbit.array;

import java.util.ArrayList;

class RotateMatrix {
    int temp;
    ArrayList<ArrayList<Integer>> a;

    public void rotate(ArrayList<ArrayList<Integer>> a) {
        if (a.size() < 2) {
            return;
        }
        this.a = a;
        Direction dir = Direction.Dir1;
        int spiral = 0;
        int end = a.size() - 1;
        int step = 0;
        temp = a.get(0).get(0);
        outer:
        while (true) {
            switch (dir) {
                case Dir1:
                    swapWithTemp(step + spiral, end - spiral);
                    dir = Direction.Dir2;
                    break;
                case Dir2:
                    swapWithTemp(end - spiral, end - step - spiral);
                    dir = Direction.Dir3;
                    break;
                case Dir3:
                    swapWithTemp(end - step - spiral, spiral);
                    dir = Direction.Dir4;
                    break;
                case Dir4:
                    swapWithTemp(spiral, step + spiral);
                    step++;
                    if (step >= end - 2 * spiral) {
                        spiral++;
                        if (end - 2 * spiral < 0) {
                            break outer;
                        } else {
                            temp = a.get(spiral).get(spiral);
                            step = 0;
                        }
                    } else {
                        temp = a.get(spiral).get(step + spiral);
                    }
                    dir = Direction.Dir1;
                    break;
            }
        }
    }

    private void swapWithTemp(int i, int j) {
        int temp2 = a.get(i).get(j);
        a.get(i).set(j, temp);
        temp = temp2;
    }

    enum Direction {
        Dir1,
        Dir2,
        Dir3,
        Dir4
    }
}