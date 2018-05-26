public class Mysqldump {
    private static Mysqldump ourInstance = new Mysqldump();

    public static Mysqldump getInstance() {
        return ourInstance;
    }

    private Mysqldump() {
    }

    public static void main(String[] args) {
        Mysqldump mysqldump = Mysqldump.getInstance();
        mysqldump.options().dbName("db1");
        mysqldump.options().dbName("db1").tableNames("tb1","tb2");
        mysqldump.options().allDatabases();
    }

    private EndOperation options() {
    }

    static class EndOperation{

        public TableName dbName(String dbname) {
        }
        public TableName dataBases(String dbname) {
        }
        public TableName allDatabases() {
        }
    }
    static class TableName{

        public void tableNames(String ...tbs) {
        }
    }
}
