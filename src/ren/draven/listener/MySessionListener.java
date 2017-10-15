/* MySessionListener.java */
package ren.draven.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MySessionListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("key: " + event.getName() + " value: " + event.getValue());
		System.out.println("-----attributeAdded-------");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("key: " + event.getName() + " value: " + event.getValue());
		System.out.println("------attributeRemoved-------");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("key: " + event.getName() + " value: " + event.getValue());
		System.out.println("-------attributeReplaced------");
	}

}
