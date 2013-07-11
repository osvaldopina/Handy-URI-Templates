/*
 *
 *
 */
package com.damnhandy.uri.template;

/**
 * Represents the non-expression parts of a URI Template
 * 
 * @author <a href="ryan@damnhandy.com">Ryan J. McDonough</a>
 * @version $Revision: 1.1 $
 * @since 2.0
 */
public class Literal extends UriTemplateComponent
{

   private final String value;

   /**
    * Create a new Literal.
    * 
    */
   public Literal(final String value, int startPosition)
   {
      super(startPosition);
      this.value = value;
   }

   @Override
   public String getValue()
   {
      return value;
   }

   @Override
   public String toString()
   {
      return value;
   }

}
