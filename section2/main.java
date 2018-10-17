package section2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class main {
	public static void main(String[] args) {
		
		// Only 10 option, our case strings
		Observable<String> source=Observable.just("first","second","third");
		Observer<String> Ob = new Observer<String>() {

			@Override
			public void onComplete() {
				System.out.println("The printing operation is complete");			
			}

			@Override
			public void onError(Throwable e) {
				e.printStackTrace();		
			}

			@Override
			public void onNext(String a) {
				System.out.println(a);		
			}

			@Override
			public void onSubscribe(Disposable arg0) {
				// TODO Auto-generated method stu	
			}
		};
		source.subscribe(Ob);
	}
}

