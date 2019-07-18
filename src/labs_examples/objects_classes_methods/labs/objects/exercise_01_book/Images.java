package labs_examples.objects_classes_methods.labs.objects.exercise_01_book;

public class Images {

    Boolean containsImages;
    String imageType;

    public Images(Boolean containsImages, String imageType) {
        this.containsImages = containsImages;
        this.imageType = imageType;
    }

    public Boolean getContainsImages() {
        return containsImages;
    }

    public void setContainsImages(Boolean containsImages) {
        this.containsImages = containsImages;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public String toString() {
        return "Images{" +
                "containsImages=" + containsImages +
                ", imageType='" + imageType + '\'' +
                '}';
    }
}
