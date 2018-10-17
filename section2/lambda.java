package section2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class lambda {

	public static void main(String[] args) {
		Observable<String> source = Observable.just("first", "second", "third", "fourth");
		source.subscribe(System.out::println, Throwable::printStackTrace, ()-> System.out.println("operation completed"));

	}

}
