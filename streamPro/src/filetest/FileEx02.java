package filetest;

import java.io.File;

public class FileEx02 {
	public static void listDirectory(File dir) {
		System.out.println("-----"+dir.getPath()+"의 서브 리스트 입니다.-----");
		File[] subFiles = dir.listFiles(); //디렉토리 내 모든 파일/폴더 목록 가져오기
		
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified(); //마지막으로 수정된 시간
			System.out.print(f.getName()); //파일 디렉토리 이름 
			System.out.print("\t파일 크기: "+f.length()); //파일 크기
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t,t,t,t);
			//%tb: 월, %td: 일, %ta: 요일, %tT: 시간(시:분:초)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("c:/windows/system.ini");
		System.out.println(f1.getPath()+","+f1.getParent()+","+f1.getName());
		//파일 전체경로/ 부모 디렉토리 / 파일이름 출력
		
		String res = "";
		if(f1.isFile()) res = "파일";
		else if(f1.isDirectory()) res = "디렉토리";
		System.out.println(f1.getPath()+"은 "+res+"입니다.");
		//파일인지 디렉토리인지 확인 후 결과 출력
		
		File f2 = new File("C:/Share_Java_WorkSpace/java_sample");
		if(!f2.exists()) {
			f2.mkdir(); //폴더가 존재하지 않으면 생성
		}
		listDirectory(new File("C:/Share_Java_WorkSpace")); //내부파일,디렉토리 목록을 출력
		f2.renameTo(new File("C:/Share_Java_WorkSpace/java_sample")); 
		//기존 폴더를 java_sample로 이름 변경 => 원래 java_sample이었으므로 이름이 변경되지 않음
		listDirectory(new File("C:/Share_Java_WorkSpace"));//다시 출력하여 이름 변경이 반영되었는지 확인

	}

}
