package EX;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 90;
        String vehicle = switch (distance) {
            case 0, 1 -> "도보를 이용하세요.";
            default -> {
                if (distance >= 2 && distance <= 10) {
                    yield "자전거를 이용하세요.";
                } else if (distance >= 11 && distance <= 100) {
                    yield "자동차를 이용하세요.";
                } else {
                    yield "비행기를 이용하세요.";
                }
            }
        };
        System.out.println(vehicle);
        }
    }
