package org.jboss.weld.context.bound;

import java.util.Map;

import org.jboss.weld.context.BoundContext;
import org.jboss.weld.context.RequestContext;

public interface BoundRequestContext extends RequestContext, BoundContext<Map<String, Object>>
{

}
