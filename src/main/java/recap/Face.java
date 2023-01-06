package recap;

public class Face {

    public Face(String colorForFace, String shapeOfFace){
        this.skinColor = colorForFace;
        this.faceShape = shapeOfFace;
    }

    String skinColor;
    String eyeColor;
    String noseSize;
    String faceShape;

    public void happy(){
        System.out.println("Face is happy");
    }

    public void sad(){
        System.out.println("Face is sad");
    }

    public void smile(){
        System.out.println("Face is smiling");
    }

    public void displayFace(){
        System.out.println("Face information");
        System.out.println("Skin color: " + skinColor);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Nose size: " + noseSize);
        System.out.println("Shape of face: " + faceShape);
        System.out.println();
    }


}
