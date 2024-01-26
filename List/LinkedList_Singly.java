package List;

public class LinkedList_Singly {
	private Node head; // 노드의 시작점
	private int size;
	
	// 조회
	public Node get(int idx) {
		if(idx < 0 || idx > size) return null;
		Node cur = head;
		
		for(int i = 0;i < idx; i++) {
			cur = cur.link;
		}
		return cur;
	}
	
	// 첫번째 원소 삽입
	public void addFirst(String data) {
		Node node = new Node(data);
		// 새로 만든 노드의 링크를 head로 수정
		node.link = head;
		// head가 새로 만든 노드를 가리키게 수정
		head = node;
		size++;
	}
	
	// 마지막 원소 삽입
	public void addLast(String data) {
		Node node = new Node(data);
		
		// size가 0과 같다는 건 첫번째 노드로 넣는거랑 똑같다.
		if(size == 0) {
			addFirst(data);
			return;
		}
		// 마지막 노드 찾아가기
		Node cur = head;
		while(cur.link != null) {
			cur = cur.link;
		}
		// cur.link에 새노드의 정보를 넣으면 되죠.
		cur.link = node;
		size++;
	}
	
	// 중간 원소 삽입
	public void add(int idx, String data) {
		if(idx < 0 || idx > size) return;
		if(idx == 0) {
			addFirst(data);
			return;
		}
		if(idx == size) {
			addLast(data);
			return;
		}
		
		// 이전 노드의 정보를 가져오자
		Node pre = get(idx-1);
		Node node = new Node(data);
		// 순서 중요. 
		node.link = pre.link;
		pre.link = node; // 얘 먼저 실행하면 연결된 노드 사라져 버린다.
		size++;
	}
	
	// 첫번째 원소 삭제
	public String remove() {
		if(head == null) return null;
		String data = head.data;
		head = head.link;
		size--;
		return data;
	}
	
	// 중간원소 삭제
	public String remove(int idx) {
		if(idx == 0) return remove();
		if(idx < 0 || idx > size) return null;
		
		Node pre = get(idx-1);
		// 지울 노드
//		Node rmNode = get(idx);
		Node rmNode = pre.link;
		
		String data = rmNode.data;
//		String data = pre.link.data;
		
		// 연결 끊고, 다음 노드 연결
		pre.link = rmNode.link;
		size--;
		return data;
	}
	
	public void printList() {
		Node cur = head;
		if(head == null) {
			System.out.println("비어있어요");
			return;
		}
		while(cur != null) {
			System.out.print(cur.data + "->");
			cur = cur.link;
		}
		System.out.println();
	}
}
