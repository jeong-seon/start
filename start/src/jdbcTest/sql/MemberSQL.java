package jdbcTest.sql;

public class MemberSQL {
	public final int SEL_MEMBER_INFO	= 1001;
	public final int SEL_MNO			= 1002;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_MEMBER_INFO:
			buff.append("SELECT ");
			buff.append("	id, name, mail ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		case SEL_MNO:
			buff.append("SELECT ");
			buff.append("	mno ");
			buff.append("FROM ");
			buff.append("	member ");
		}
		return buff.toString();
	}
}
