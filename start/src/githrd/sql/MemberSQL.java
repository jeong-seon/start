package githrd.sql;

public class MemberSQL {
	public final int SEL_MNOID		= 1001;
	public final int SEL_NO1001		= 1002;
	public final int SEL_ALLID		= 1003;
	public final int UP_IDTEL		= 1004;
	public final int INSERT_JOIN	= 1005;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_MNOID:
			buff.append("SELECT ");
			buff.append("	mno, id ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case SEL_NO1001:
			buff.append("SELECT ");
			buff.append("    mno, name, id, pw, mail, tel, avt, gen, joindate ");
			buff.append("FROM ");
			buff.append("    member ");
			buff.append("WHERE ");
			buff.append("    mno = ? ");
			break;
		case SEL_ALLID:
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case UP_IDTEL:
			buff.append("UPDATE ");
			buff.append("    member ");
			buff.append("SET ");
			buff.append("    tel = ? ");
			buff.append("WHERE ");
			buff.append("    id = ? ");
			break;
		case INSERT_JOIN:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, avt, gen) ");
			buff.append("VALUES( ");
			buff.append("		NVL(mno + 1, 1001), ?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		}
		
		return buff.toString();
	}
}
