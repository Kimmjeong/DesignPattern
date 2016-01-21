package pattern.behavioral.iterator.aggregate;

import pattern.behavioral.iterator.iterator.Iterator;

/* Iterator 객체를 생성하는 인터페이스 제공 */
public interface Aggregate {
	public abstract Iterator iterator();
}
