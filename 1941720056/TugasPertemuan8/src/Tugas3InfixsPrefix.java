
public class Tugas3InfixsPrefix {
    public int a,top;
    public char[]stack;
    
public Tugas3InfixsPrefix(int jumlah){
    a = jumlah;
        top = -1;
        stack = new char[a];
        push(')');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c
                == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int presedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String A) {
        String b = "";
        char c;
        for (int i = 0; i < a; i++) {
            c = A.charAt(i);
            if (IsOperand(c)) {
                b = b + c;
            }
            if (c == ')') {
                push(c);
            }
            if (c == '(') {
                while (stack[top] != ')') {
                    b = b+ pop();
                }
                char temp = pop();
            }
            if (IsOperator(c)) {
                while (presedence(stack[top]) >= presedence(c)) {
                    b = b + pop();
                }
                push(c);
            }
        }
        return b;
    }
}
