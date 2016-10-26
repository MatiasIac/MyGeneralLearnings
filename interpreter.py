# coding=utf-8
import codecs


class Context(object):
    def __init__(self, expression):
        self.expression = expression


class ExpressionBase(object):

    def constructor(self):
        pass

    def interpret(self, context):
        pass


class NumberExpression(ExpressionBase):
    def constructor(self):
        # do something
        pass

    def interpret(self, context):
        if context.expression.index(u'si es número') < 0:
            raise Exception("Incorrect syntax for NumberExpression")


class StringExpression(ExpressionBase):
    pass


class ConstraintExpression(ExpressionBase):
    pass


# Let's put the tree together
tree = [
    ConstraintExpression,
    NumberExpression,
    StringExpression
]


# Let's put a context together
def parse_file(filename):

    # Let's read the file and start working on it
    content = codecs.open(filename, encoding='utf-8').read()
    content = content.split("\n    si")

    # After splitting, we expect a list of 3 elements
    if len(content) != 3:
        raise Exception("Invalid file format. Parse should get 3 sections and "
                        "it got %s", len(content))

    # Markers
    header_str = "Crear reglas:"
    const_str = "objeto no nulo"

    # Let's start putting the data together, easy stuff first
    data = {'header': header_str if header_str in content[0] else None,
            'constraint': const_str if const_str in content[0] else None}

    for group in content[1:]:
        group = group.strip().split('\n')
        if "texto" in group[0]:
            data['text'] = [elem.strip() for elem in group[1:]]
        elif u"número" in group[0]:
            data['number'] = [elem.strip() for elem in group[1:]]
        else:
            raise Exception("Invalid group content: %s", group[0])

    return data

context = parse_file('rules.txt')
print context
for element in tree:
    element.interpret(context)
