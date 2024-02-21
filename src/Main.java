public class Main {
    public static void main(String[] args) {
		example1();
//		example2();
//		example3();// escape sequence \
//		example4();// escape sequence \s
    }

	private static void example1(){
		String string = "Hello";
		String textBlock = """
     
					World""";

		String joinedString =  string + textBlock;

		System.out.println(joinedString);
	}
	private static void example2(){
		String dbSchema = 	"""
			CREATE TABLE 'TEST'.'EMPLOYEE'
			(
			  	'ID' INT NOT NULL DEFAULT 0 ,
			  	'FIRST_NAME' VARCHAR(100) NOT NULL ,
			  	'LAST_NAME' VARCHAR(100) NULL ,
			  	'STAT_CD' TINYINT NOT NULL DEFAULT 0
			);
	""";

		System.out.println(dbSchema);
	}
	private static void example3(){
		String dbSchema = """
			CREATE TABLE 'TEST'.'EMPLOYEE'\
			(\
			'ID' INT NOT NULL DEFAULT 0 ,\
			'FIRST_NAME' VARCHAR(100) NOT NULL ,
			'LAST_NAME' VARCHAR(100) NULL ,\
			'STAT_CD' TINYINT NOT NULL DEFAULT 0 \
			);
			""";

		System.out.println(dbSchema);
	}
	private static void example4(){
		String dbSchema ="""
			CREATE TABLE 'TEST'.'EMPLOYEE'          \s
			(                                       \s
			  'ID' INT NOT NULL DEFAULT 0 ,         \s
			   'FIRST_NAME' VARCHAR(100) NOT NULL , \s
			  'LAST_NAME' VARCHAR(100) NULL ,       \s
			  'STAT_CD' TINYINT NOT NULL DEFAULT 0  \s
			);                                      \s
			""";

		System.out.println(dbSchema.replaceAll("\s", "."));
	}
}