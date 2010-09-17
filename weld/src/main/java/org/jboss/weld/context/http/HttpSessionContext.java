package org.jboss.weld.context.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.weld.context.BoundContext;
import org.jboss.weld.context.SessionContext;

public interface HttpSessionContext extends BoundContext<HttpServletRequest>, SessionContext
{

   /**
    * <p>
    * Mark the Session Context for destruction; the Session Context will be
    * detached from the underling Http Session, and instances marked for
    * destruction when the Http Request is destroyed.
    * </p>
    * 
    */
   public void invalidate();

   /**
    * <p>
    * A special version of invalidate that handle being called outside of an
    * Http Request.
    * </p>
    * 
    * <p>
    * If the context is not currently associated with a
    * {@link HttpServletRequest}, then the context will be associated with the
    * specified {@link HttpSession} (for this thread), activated, destroyed, and
    * then deactivated.
    * </p>
    * 
    * <p>
    * If the context is already associated with a {@link HttpServletRequest}
    * then this call will detach the context from the underlying Http Session,
    * and mark the context for destruction when the request is destroyed.
    * </p>
    * 
    * @param session the {@link HttpSession} in which to store the bean
    *           instances
    * @return true if the context was destroyed immediately
    */
   public boolean invalidate(HttpSession session);

}
