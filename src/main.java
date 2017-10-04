public class main {
    /**
     * The arguments that can be added are:
     *
     */
    public static void main(String[] args) {
        //needed variables
        String baseURI = "";
        String user = "";
        String password = "";
        String objectSchema1 = "";
        String objectSchema2 = "";
        String compareObject = "";

        //Needed URI's
        String objectSchemaList = baseURI+"/rest/insight/1.0/objectschema/list";
        String objectTypesList = baseURI+"/rest/insight/1.0/objectschema/[objectschemaid]/objecttypes/flat";
        String objectsList = baseURI+"/rest/insight/1.0/objecttype/[objecttypeid]/objects";
        String object = baseURI+"/rest/insight/1.0/object/[objectid]";


        for (String s:args) {
            switch (s){
                case "":
                    break;
            }
        }
    }
}
