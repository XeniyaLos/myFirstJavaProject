package recap;

public class Software {
    public static void main(String[] args) {

        Face face1 = new Face("red", "oval");
        Face face2 = new Face("olive", "square");
        Face face3 = new Face("black", "heart");

        face1.skinColor = "white";
        face1.eyeColor = "blue";
        face1.noseSize = "small";
        face1.faceShape  ="round";

        face1.displayFace();
        face2.displayFace();
        face3.displayFace();
    }
}
