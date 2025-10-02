
public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier){
        this.identifier = identifier;
        // this.name = name;
    }

    public Archive(String identifier,String name){
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {
        // If the variables are located in the same position in memory, they're the same
        if (this == compared) {
            return true;
        }

        // If compared is null or not of type Archive, objects are not equal
        if (compared == null || getClass() != compared.getClass()) {
            return false;
        }

        // Convert compared to Archive type
        Archive comparedArchive = (Archive) compared;

        // If the identifiers are the same, the objects are equal
        // Using equals handles null identifiers safely (though in your implementation that shouldn't happen)
        return this.identifier != null && this.identifier.equals(comparedArchive.identifier);
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
