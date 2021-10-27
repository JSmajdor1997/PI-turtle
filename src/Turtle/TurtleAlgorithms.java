package Turtle;

import turtlePck.TurtleGraphicsWindow;

public class TurtleAlgorithms extends TurtleGraphicsWindow {
    public void A1(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 4; ++i) {
            forward(length);
            A1(length / 2, level - 1);
            right(90);
        }
    }

    public void A2(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length);
            A2(length / 2, level - 1);
            right(120);
        }
    }

    public void A3(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 4; ++i) {
            forward(length);
            A3(length / 2, level - 1);

            if (level % 2 == 0) {
                right(90);
            } else {
                left(90);
            }
        }

        //A3(length / 2, level - 1);
    }

    public void A4(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length);
            right(60);
            A4(length / 2, level - 1);
            left(60);
            left(120);
        }
    }

    public void A5(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length);
            left(60);
            A5(length / 2, level - 1);
            left(60);
        }
    }

    public void A6(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 4; ++i) {
            forward(length * 1 / 4);
            right(90);
            A6(length / 2, level - 1);
            left(90);
            forward(length * 3 / 4);
            left(90);
        }
    }

    public void A7(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length * 1 / 4);
            right(60);
            A7(length / 2, level - 1);
            left(60);
            forward(length * 3 / 4);
            left(120);
        }
    }

    public void A8(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 6; ++i) {
            forward(length * 1 / 4);
            right(120);
            A8(length / 2, level - 1);
            left(120);
            forward(length * 3 / 4);
            left(60);
        }
    }

    public void A9(int length, int level) {
        if (level == 0 || length < 40) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            forward(length - i * 10);
            left(90);
        }

        A9(length - 40, level - 1);
    }

    public void A10(int length, int level) {
        if (level == 0 || length <= 30) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            forward(length - i * 10);
            left(120);
        }

        A10(length - 30, level - 1);
    }

    public void A11(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            forward(length - (i == 2 ? 10 : 0));
            left(60);
        }

        A11(length - 10, level - 1);
    }

    public void A12(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                A12(length / 3, level - 1);
                forward(length * 1 / 3);
            }

            left(120);
        }
    }

    public void A13(int length, int level) {
        if (level == 0) {
            return;
        }

        forward(length);
        right(45);
        A13(length*3/4, level-1);
        left(90);
        A13(length*3/4, level-1);
        left(135);
        forward(length);
        right(180);
    }

    public void B1(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 2; ++i) {
            B1(length / 2, level - 1);

            for (int j = 0; j < 2; j++) {
                forward(length);
                left(90);
            }

            B1(length / 2, level - 1);
        }
    }

    public void B2(int length, int level) {
        st();
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length * 1 / 4);
            right(120);
            B2(length / 2, level - 1);
            left(120);
            forward(length * 3 / 4);
            left(60);
            forward(length);
            left(60);
        }
    }

    public void B3(int length, int level) {
        st();
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 2; ++i) {
            forward(length);
            left(90);
            forward(length * 1 / 4);
            right(90);
            B3(length / 2, level - 1);
            left(90);
            forward(length * 3 / 4);
            left(90);
        }
    }

    public void B4(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 2; i++) {
            forward(length);
            right(90);
            B4(length / 2, level - 1);
            right(180);
            forward(length);
            left(90);
        }
    }

    public void B5(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 4; ++i) {
            forward(length);
            left(90);
            B5(length / 3, level - 1);
        }
    }

    public void B6(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length);
            left(120);
            B6(length / 3, level - 1);
        }
    }

    public void B7(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length);
            left(60);
            forward(length / 2);
            left(60);
            B7(length / 2, level - 1);
            right(60);
            forward(length / 2);
            left(60);
        }
    }

    public void B8(int length, int level) {
        if (level == 0) {
            return;
        }

        left(45);
        forward(length);

        for (int i = 0; i < 2; ++i) {
            B8(length / 2, level - 1);
            left(180);
            forward(length);
            left(135);
            forward(length);
        }

        B8(length / 2, level - 1);
        left(180);
        forward(length);
        right(135);
    }

    public void C1(int length, int level) {
        if (level == 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length);
            left(125);
        }

        C1(length - 5, level - 1);
    }

    public void C2(int length, int level) {
        if (level <= 10) {
            return;
        }

        forward(length);
        left(144);
        C2(length + 10, level - 1);
    }

    public void C3(int length, int level) {
        if (level <= 10) {
            return;
        }

        forward(length);
        left(95);
        C3(length - 5, level - 1);

    }

    public void C4(int length, int level) {
        if (level <= 0) {
            return;
        }

        int dashLength = (int) (length / (2 * Math.cos(Math.PI / 4)));

        //right side
        forward(length);

        right(45);
        C4(dashLength, level - 1);
        left(45);
        left(45);

        forward(dashLength);

        C4(dashLength, level - 1);

        left(90);
        forward(dashLength);

        left(45);
        forward(length);

        left(90);
        forward(length);

        left(90);

    }

    public void C5(int length, int level) {
        if (level <= 0) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                C5(length / 3, level - 1);
                forward(length / 3);
            }

            forward(length / 3);
            left(90);
        }
    }

    public void C6(int length, int level) {
        if (level <= 0) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            forward(length / 2);
            C6(length / 2, level - 1);
            back(length / 2);

            left(120);
        }
    }

    public void C7(int length, int level) {
        if (level <= 0) {
            return;
        }

        C7(length / 3, level - 1);

        for (int i = 0; i < 4; i++) {
            forward(length / 3 * 2);
            C7(length / 3, level - 1);
            back(length / 3 * 2);
            left(90);
        }
    }
}
