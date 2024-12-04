public class Park {
    private String name;
    private String address;
    private String parkWorkTime;

    FerrisWheel ferrisWheel;
    ShootingGallery shootingGallery;

    public Park(String name, String address, String parkWorkTime) {
        this.name = name;
        this.address = address;
        this.parkWorkTime = parkWorkTime;
        this.ferrisWheel = new FerrisWheel();
        this.shootingGallery = new ShootingGallery();
    }

    public class FerrisWheel{
        private String ferrisWheelWorkTime = "8:00AM - 5:00PM";
        private String ferrisWheelDescription = "A mechanical attraction in the form of a large vertically mounted wheel, with passenger cabins attached to the rim. Ferris wheels are available in many amusement parks and other places.Ы";
        private String ferrisWheelPrice = "5$";



        public String getFerrisWheelWorkTime() {
            return ferrisWheelWorkTime;
        }

        public String getFerrisWheelDescription() {
            return ferrisWheelDescription;
        }

        public String getFerrisWheelPrice() {
            return ferrisWheelPrice;
        }
    }

    public class ShootingGallery{
        private String shootingGalleryWorkTime = "8:00AM - 5:00PM";
        private String shootingGalleryDescription = "The most popular entertainment among adults and children visiting our amusement park is shooting range.";
        private String shootingGalleryPrice = "10$";

        public String getShootingGalleryWorkTime() {
            return shootingGalleryWorkTime;
        }

        public String getShootingGalleryDescription() {
            return shootingGalleryDescription;
        }

        public String getShootingGalleryPrice() {
            return shootingGalleryPrice;
        }
    }



}
